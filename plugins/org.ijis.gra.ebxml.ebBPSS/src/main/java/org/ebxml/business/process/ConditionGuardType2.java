/**
 */
package org.ebxml.business.process;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Condition Guard Type2</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ebxml.business.process.ProcessPackage#getConditionGuardType2()
 * @model extendedMetaData="name='conditionGuard_._2_._type'"
 * @generated
 */
public enum ConditionGuardType2 implements Enumerator {
	/**
	 * The '<em><b>Success</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUCCESS_VALUE
	 * @generated
	 * @ordered
	 */
	SUCCESS(0, "Success", "Success"),

	/**
	 * The '<em><b>Business Failure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSINESS_FAILURE_VALUE
	 * @generated
	 * @ordered
	 */
	BUSINESS_FAILURE(1, "BusinessFailure", "BusinessFailure"),

	/**
	 * The '<em><b>Technical Failure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TECHNICAL_FAILURE_VALUE
	 * @generated
	 * @ordered
	 */
	TECHNICAL_FAILURE(2, "TechnicalFailure", "TechnicalFailure"),

	/**
	 * The '<em><b>Any Failure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_FAILURE_VALUE
	 * @generated
	 * @ordered
	 */
	ANY_FAILURE(3, "AnyFailure", "AnyFailure");

	/**
	 * The '<em><b>Success</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Success</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUCCESS
	 * @model name="Success"
	 * @generated
	 * @ordered
	 */
	public static final int SUCCESS_VALUE = 0;

	/**
	 * The '<em><b>Business Failure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Business Failure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUSINESS_FAILURE
	 * @model name="BusinessFailure"
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_FAILURE_VALUE = 1;

	/**
	 * The '<em><b>Technical Failure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Technical Failure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TECHNICAL_FAILURE
	 * @model name="TechnicalFailure"
	 * @generated
	 * @ordered
	 */
	public static final int TECHNICAL_FAILURE_VALUE = 2;

	/**
	 * The '<em><b>Any Failure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Any Failure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANY_FAILURE
	 * @model name="AnyFailure"
	 * @generated
	 * @ordered
	 */
	public static final int ANY_FAILURE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Condition Guard Type2</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConditionGuardType2[] VALUES_ARRAY =
		new ConditionGuardType2[] {
			SUCCESS,
			BUSINESS_FAILURE,
			TECHNICAL_FAILURE,
			ANY_FAILURE,
		};

	/**
	 * A public read-only list of all the '<em><b>Condition Guard Type2</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConditionGuardType2> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Condition Guard Type2</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConditionGuardType2 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConditionGuardType2 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Condition Guard Type2</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConditionGuardType2 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConditionGuardType2 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Condition Guard Type2</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConditionGuardType2 get(int value) {
		switch (value) {
			case SUCCESS_VALUE: return SUCCESS;
			case BUSINESS_FAILURE_VALUE: return BUSINESS_FAILURE;
			case TECHNICAL_FAILURE_VALUE: return TECHNICAL_FAILURE;
			case ANY_FAILURE_VALUE: return ANY_FAILURE;
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
	private ConditionGuardType2(int value, String name, String literal) {
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
	
} //ConditionGuardType2
