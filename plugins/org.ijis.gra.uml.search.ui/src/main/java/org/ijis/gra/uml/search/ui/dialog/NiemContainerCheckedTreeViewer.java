/*
 * This program and the accompanying materials are made available
 * under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IJIS - initial API and implementation
 *
 */
package org.ijis.gra.uml.search.ui.dialog;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArraySet;

import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.ui.dialogs.ContainerCheckedTreeViewer;
import org.ijis.gra.uml.search.ui.Activator;

public class NiemContainerCheckedTreeViewer extends ContainerCheckedTreeViewer {

    private final Collection<NiemCheckedTreeSelectionListener> niemCheckedTreeSelectionListeners;

    public NiemContainerCheckedTreeViewer(final Composite parent, final int style) {
        super(parent, style);
        niemCheckedTreeSelectionListeners = new CopyOnWriteArraySet<>();
    }

    public void addNiemCheckedTreeSelectionListener(final NiemCheckedTreeSelectionListener listener) {
        niemCheckedTreeSelectionListeners.add(listener);
    }

    public void removeNiemCheckedTreeSelectionListener(final NiemCheckedTreeSelectionListener listener) {
        niemCheckedTreeSelectionListeners.remove(listener);
    }

    private void fireItemsGreyed(final Collection<TreeItem> treeItems) {
        if (treeItems.isEmpty()) {
            return;
        }
        fire(new Lambda() {
            @Override
            public void _(final NiemCheckedTreeSelectionListener listener) {
                listener.greyed(treeItems);
            }
        });
    }

    private void fireItemsChecked(final Collection<TreeItem> treeItems) {
        if (treeItems.isEmpty()) {
            return;
        }
        fire(new Lambda() {
            @Override
            public void _(final NiemCheckedTreeSelectionListener listener) {
                listener.checked(treeItems);
            }
        });
    }

    private void fireItemsUnchecked(final Collection<TreeItem> treeItems) {
        if (treeItems.isEmpty()) {
            return;
        }
        fire(new Lambda() {
            @Override
            public void _(final NiemCheckedTreeSelectionListener listener) {
                listener.unchecked(treeItems);
            }
        });
    }

    private void fire(final Lambda l) {
        final Exception aggregator = new Exception("Exceptions while firing event.");
        for (final NiemCheckedTreeSelectionListener listener : niemCheckedTreeSelectionListeners) {
            SafeRunner.run(new ISafeRunnable() {
                @Override
                public void run() throws Exception {
                    l._(listener);
                }

                @Override
                public void handleException(final Throwable exception) {
                    aggregator.addSuppressed(exception);
                }
            });
        }
        if (aggregator.getSuppressed().length > 0) {
            Activator.INSTANCE.log(aggregator);
        }
    }

    private void setStates(final Iterable<TreeItem> treeItems, final boolean checked, final boolean grayed) {
        for (final TreeItem treeItem : treeItems) {
            treeItem.setChecked(checked);
            treeItem.setGrayed(grayed);
        }
    }

    private void handleItemGreyed(final TreeItem theSource) {
        final Collection<TreeItem> similarItems = findTreeItems(theSource.getData());
        final Collection<TreeItem> grayedItems = new ArrayList<>(similarItems);
        collectChangedParents(theSource.getParentItem(), grayedItems, true);
        setStates(grayedItems, true, true);
        fireItemsGreyed(grayedItems);
    }

    private void handleItemChecked(final TreeItem theSource) {
        final Collection<TreeItem> similarItems = findTreeItems(theSource.getData());
        final Collection<TreeItem> checkedItems = new ArrayList<>(similarItems);
        final Collection<TreeItem> grayedItems = new ArrayList<>();
        collectChangedProgeny(theSource, checkedItems, Collections.<TreeItem> emptyList(), true);
        collectChangedParents(theSource, grayedItems, true);
        setStates(checkedItems, true, false);
        setStates(grayedItems, true, true);
        fireItemsChecked(checkedItems);
        fireItemsGreyed(grayedItems);
    }

    private void handleItemUnchecked(final TreeItem theSource) {
        final Collection<TreeItem> similarItems = findTreeItems(theSource.getData());
        final Collection<TreeItem> uncheckedItems = new ArrayList<>(similarItems);
        final Collection<TreeItem> grayedItems = new ArrayList<>();
        collectChangedProgeny(theSource, Collections.<TreeItem> emptyList(), uncheckedItems, false);
        collectChangedParents(theSource.getParentItem(), grayedItems, false);
        setStates(uncheckedItems, false, false);
        setStates(grayedItems, true, true);
        fireItemsUnchecked(uncheckedItems);
        fireItemsGreyed(grayedItems);
    }

    public Collection<TreeItem> findTreeItems(final Object element) {
        final Collection<TreeItem> treeItems = new ArrayList<>();
        final Widget[] ws = findItems(element);
        for (final Widget w : ws) {
            if (w instanceof TreeItem) {
                treeItems.add((TreeItem) w);
            }
        }
        return treeItems;
    }

    @Override
    protected final void doCheckStateChanged(final Object element) {
        // disable the default check state change behavior
    }

    @Override
    protected void handleSelect(final SelectionEvent event) {
        super.handleSelect(event);
        if (event.detail == SWT.CHECK) {
            final TreeItem theItem = (TreeItem) event.item;
            final Object data = theItem.getData();
            if (data != null) {
                doCheckStateChanged(theItem);
            }
        }
    }

    private void doCheckStateChanged(final TreeItem treeItem) {
        if (treeItem.getChecked()) { // going from unchecked to greyed
            handleItemGreyed(treeItem);
        } else if (!treeItem.getChecked() && treeItem.getGrayed()) { // going from grayed to fully checked
            handleItemChecked(treeItem);
        } else { // going from fully checked to unchecked
            handleItemUnchecked(treeItem);
        }
    }

    @Override
    protected TreeItem[] getChildren(final Widget o) {
        return (TreeItem[]) super.getChildren(o);
    }

    private void collectChangedProgeny(final TreeItem parent, final Collection<TreeItem> checked,
            final Collection<TreeItem> unchecked, final boolean anAncestorIsBeingChecked) {
        for (final TreeItem item : getChildren(parent)) {
            final TreeItem current = item;
            if (current.getData() != null && current.getChecked() != anAncestorIsBeingChecked || current.getGrayed()) {
                if (anAncestorIsBeingChecked) {
                    checked.addAll(findTreeItems(current.getData()));
                } else {
                    unchecked.addAll(findTreeItems(current.getData()));
                }
                collectChangedProgeny(current, checked, unchecked, anAncestorIsBeingChecked);
            }
        }
    }

    private void collectChangedParents(final TreeItem item, final Collection<TreeItem> grayed,
            final boolean aProgenyIsBeingChecked) {
        if (item == null) {
            return;
        }
        if (item.getData() != null
                && (aProgenyIsBeingChecked && !item.getChecked() && !item.getGrayed() || !aProgenyIsBeingChecked
                        && item.getChecked() && !item.getGrayed())) {
            grayed.addAll(findTreeItems(item.getData()));
            collectChangedParents(item.getParentItem(), grayed, aProgenyIsBeingChecked);
        }
    }

    private static interface Lambda {
        void _(final NiemCheckedTreeSelectionListener listener);
    }
}
