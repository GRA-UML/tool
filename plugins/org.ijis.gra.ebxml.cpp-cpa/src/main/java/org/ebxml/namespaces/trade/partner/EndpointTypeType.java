/**
 */
package org.ebxml.namespaces.trade.partner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Endpoint Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getEndpointTypeType()
 * @model extendedMetaData="name='endpointType.type'"
 * @generated
 */
public enum EndpointTypeType implements Enumerator {
	/**
	 * The '<em><b>Login</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIN_VALUE
	 * @generated
	 * @ordered
	 */
	LOGIN(0, "login", "login"),

	/**
	 * The '<em><b>Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	REQUEST(1, "request", "request"),

	/**
	 * The '<em><b>Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	RESPONSE(2, "response", "response"),

	/**
	 * The '<em><b>Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR(3, "error", "error"),

	/**
	 * The '<em><b>All Purpose</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_PURPOSE_VALUE
	 * @generated
	 * @ordered
	 */
	ALL_PURPOSE(4, "allPurpose", "allPurpose");

	/**
	 * The '<em><b>Login</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Login</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOGIN
	 * @model name="login"
	 * @generated
	 * @ordered
	 */
	public static final int LOGIN_VALUE = 0;

	/**
	 * The '<em><b>Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Request</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUEST
	 * @model name="request"
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_VALUE = 1;

	/**
	 * The '<em><b>Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Response</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESPONSE
	 * @model name="response"
	 * @generated
	 * @ordered
	 */
	public static final int RESPONSE_VALUE = 2;

	/**
	 * The '<em><b>Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Error</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR
	 * @model name="error"
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_VALUE = 3;

	/**
	 * The '<em><b>All Purpose</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>All Purpose</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALL_PURPOSE
	 * @model name="allPurpose"
	 * @generated
	 * @ordered
	 */
	public static final int ALL_PURPOSE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Endpoint Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EndpointTypeType[] VALUES_ARRAY =
		new EndpointTypeType[] {
			LOGIN,
			REQUEST,
			RESPONSE,
			ERROR,
			ALL_PURPOSE,
		};

	/**
	 * A public read-only list of all the '<em><b>Endpoint Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EndpointTypeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Endpoint Type Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EndpointTypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EndpointTypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Endpoint Type Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EndpointTypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EndpointTypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Endpoint Type Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EndpointTypeType get(int value) {
		switch (value) {
			case LOGIN_VALUE: return LOGIN;
			case REQUEST_VALUE: return REQUEST;
			case RESPONSE_VALUE: return RESPONSE;
			case ERROR_VALUE: return ERROR;
			case ALL_PURPOSE_VALUE: return ALL_PURPOSE;
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
	private EndpointTypeType(int value, String name, String literal) {
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
	
} //EndpointTypeType
