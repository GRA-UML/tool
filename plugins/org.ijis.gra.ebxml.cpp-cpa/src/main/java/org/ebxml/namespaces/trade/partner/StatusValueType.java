/**
 */
package org.ebxml.namespaces.trade.partner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Status Value Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getStatusValueType()
 * @model extendedMetaData="name='statusValue.type'"
 * @generated
 */
public enum StatusValueType implements Enumerator {
	/**
	 * The '<em><b>Agreed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGREED_VALUE
	 * @generated
	 * @ordered
	 */
	AGREED(0, "agreed", "agreed"),

	/**
	 * The '<em><b>Signed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNED_VALUE
	 * @generated
	 * @ordered
	 */
	SIGNED(1, "signed", "signed"),

	/**
	 * The '<em><b>Proposed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPOSED_VALUE
	 * @generated
	 * @ordered
	 */
	PROPOSED(2, "proposed", "proposed");

	/**
	 * The '<em><b>Agreed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Agreed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AGREED
	 * @model name="agreed"
	 * @generated
	 * @ordered
	 */
	public static final int AGREED_VALUE = 0;

	/**
	 * The '<em><b>Signed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Signed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIGNED
	 * @model name="signed"
	 * @generated
	 * @ordered
	 */
	public static final int SIGNED_VALUE = 1;

	/**
	 * The '<em><b>Proposed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Proposed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROPOSED
	 * @model name="proposed"
	 * @generated
	 * @ordered
	 */
	public static final int PROPOSED_VALUE = 2;

	/**
	 * An array of all the '<em><b>Status Value Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StatusValueType[] VALUES_ARRAY =
		new StatusValueType[] {
			AGREED,
			SIGNED,
			PROPOSED,
		};

	/**
	 * A public read-only list of all the '<em><b>Status Value Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StatusValueType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Status Value Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatusValueType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StatusValueType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Status Value Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatusValueType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StatusValueType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Status Value Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatusValueType get(int value) {
		switch (value) {
			case AGREED_VALUE: return AGREED;
			case SIGNED_VALUE: return SIGNED;
			case PROPOSED_VALUE: return PROPOSED;
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
	private StatusValueType(int value, String name, String literal) {
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
	
} //StatusValueType
