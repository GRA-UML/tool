/**
 */
package org.ebxml.namespaces.trade.partner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ds Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDsType()
 * @model extendedMetaData="name='ds.type'"
 * @generated
 */
public enum DsType implements Enumerator {
	/**
	 * The '<em><b>Once And Only Once</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONCE_AND_ONLY_ONCE_VALUE
	 * @generated
	 * @ordered
	 */
	ONCE_AND_ONLY_ONCE(0, "OnceAndOnlyOnce", "OnceAndOnlyOnce"),

	/**
	 * The '<em><b>Best Effort</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEST_EFFORT_VALUE
	 * @generated
	 * @ordered
	 */
	BEST_EFFORT(1, "BestEffort", "BestEffort");

	/**
	 * The '<em><b>Once And Only Once</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Once And Only Once</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONCE_AND_ONLY_ONCE
	 * @model name="OnceAndOnlyOnce"
	 * @generated
	 * @ordered
	 */
	public static final int ONCE_AND_ONLY_ONCE_VALUE = 0;

	/**
	 * The '<em><b>Best Effort</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Best Effort</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEST_EFFORT
	 * @model name="BestEffort"
	 * @generated
	 * @ordered
	 */
	public static final int BEST_EFFORT_VALUE = 1;

	/**
	 * An array of all the '<em><b>Ds Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DsType[] VALUES_ARRAY =
		new DsType[] {
			ONCE_AND_ONLY_ONCE,
			BEST_EFFORT,
		};

	/**
	 * A public read-only list of all the '<em><b>Ds Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DsType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ds Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DsType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DsType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ds Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DsType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DsType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ds Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DsType get(int value) {
		switch (value) {
			case ONCE_AND_ONLY_ONCE_VALUE: return ONCE_AND_ONLY_ONCE;
			case BEST_EFFORT_VALUE: return BEST_EFFORT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DsType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //DsType
