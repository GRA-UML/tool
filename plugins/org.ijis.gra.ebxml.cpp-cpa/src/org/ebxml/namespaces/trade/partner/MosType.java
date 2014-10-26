/**
 */
package org.ebxml.namespaces.trade.partner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Mos Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getMosType()
 * @model extendedMetaData="name='mos.type'"
 * @generated
 */
public enum MosType implements Enumerator {
	/**
	 * The '<em><b>Guaranteed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GUARANTEED_VALUE
	 * @generated
	 * @ordered
	 */
	GUARANTEED(0, "Guaranteed", "Guaranteed"),

	/**
	 * The '<em><b>Not Guaranteed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_GUARANTEED_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_GUARANTEED(1, "NotGuaranteed", "NotGuaranteed");

	/**
	 * The '<em><b>Guaranteed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Guaranteed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GUARANTEED
	 * @model name="Guaranteed"
	 * @generated
	 * @ordered
	 */
	public static final int GUARANTEED_VALUE = 0;

	/**
	 * The '<em><b>Not Guaranteed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Not Guaranteed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_GUARANTEED
	 * @model name="NotGuaranteed"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_GUARANTEED_VALUE = 1;

	/**
	 * An array of all the '<em><b>Mos Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MosType[] VALUES_ARRAY =
		new MosType[] {
			GUARANTEED,
			NOT_GUARANTEED,
		};

	/**
	 * A public read-only list of all the '<em><b>Mos Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MosType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Mos Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MosType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MosType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mos Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MosType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MosType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mos Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MosType get(int value) {
		switch (value) {
			case GUARANTEED_VALUE: return GUARANTEED;
			case NOT_GUARANTEED_VALUE: return NOT_GUARANTEED;
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
	private MosType(int value, String name, String literal) {
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
	
} //MosType
