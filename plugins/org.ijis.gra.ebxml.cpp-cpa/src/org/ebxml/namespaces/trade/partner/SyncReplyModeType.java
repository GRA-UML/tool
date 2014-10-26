/**
 */
package org.ebxml.namespaces.trade.partner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sync Reply Mode Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getSyncReplyModeType()
 * @model extendedMetaData="name='syncReplyMode.type'"
 * @generated
 */
public enum SyncReplyModeType implements Enumerator {
	/**
	 * The '<em><b>Response Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESPONSE_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	RESPONSE_ONLY(0, "responseOnly", "responseOnly"),

	/**
	 * The '<em><b>Signals And Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNALS_AND_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	SIGNALS_AND_RESPONSE(1, "signalsAndResponse", "signalsAndResponse"),

	/**
	 * The '<em><b>Signals Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNALS_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	SIGNALS_ONLY(2, "signalsOnly", "signalsOnly"),

	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(3, "none", "none");

	/**
	 * The '<em><b>Response Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Response Only</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESPONSE_ONLY
	 * @model name="responseOnly"
	 * @generated
	 * @ordered
	 */
	public static final int RESPONSE_ONLY_VALUE = 0;

	/**
	 * The '<em><b>Signals And Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Signals And Response</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIGNALS_AND_RESPONSE
	 * @model name="signalsAndResponse"
	 * @generated
	 * @ordered
	 */
	public static final int SIGNALS_AND_RESPONSE_VALUE = 1;

	/**
	 * The '<em><b>Signals Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Signals Only</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIGNALS_ONLY
	 * @model name="signalsOnly"
	 * @generated
	 * @ordered
	 */
	public static final int SIGNALS_ONLY_VALUE = 2;

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Sync Reply Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SyncReplyModeType[] VALUES_ARRAY =
		new SyncReplyModeType[] {
			RESPONSE_ONLY,
			SIGNALS_AND_RESPONSE,
			SIGNALS_ONLY,
			NONE,
		};

	/**
	 * A public read-only list of all the '<em><b>Sync Reply Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SyncReplyModeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sync Reply Mode Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SyncReplyModeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SyncReplyModeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sync Reply Mode Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SyncReplyModeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SyncReplyModeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sync Reply Mode Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SyncReplyModeType get(int value) {
		switch (value) {
			case RESPONSE_ONLY_VALUE: return RESPONSE_ONLY;
			case SIGNALS_AND_RESPONSE_VALUE: return SIGNALS_AND_RESPONSE;
			case SIGNALS_ONLY_VALUE: return SIGNALS_ONLY;
			case NONE_VALUE: return NONE;
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
	private SyncReplyModeType(int value, String name, String literal) {
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
	
} //SyncReplyModeType
