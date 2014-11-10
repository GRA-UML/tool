/**
 */
package data.grauml.graWsdl;

import data.grauml.graAnnotationModel.Message;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wsdl Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * WSDL Extension of the technology-independent element. Represents a <wsdl:message>, its contained <part>, and its usage from a <wsdl:input>, <wsdl:output>, or a <wsdl:fault> within a <wsdl:portType> <wsdl:operation> .
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.grauml.graWsdl.WsdlMessage#getMessageLocationCode <em>Message Location Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.grauml.graWsdl.GraWsdlPackage#getWsdlMessage()
 * @model
 * @generated
 */
public interface WsdlMessage extends Message {
	/**
	 * Returns the value of the '<em><b>Message Location Code</b></em>' attribute.
	 * The literals are from the enumeration {@link data.grauml.graWsdl.MessageLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When used in conjunction with a soap binding, indicates the location of the part within the message: body, header, url.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Location Code</em>' attribute.
	 * @see data.grauml.graWsdl.MessageLocation
	 * @see #setMessageLocationCode(MessageLocation)
	 * @see data.grauml.graWsdl.GraWsdlPackage#getWsdlMessage_MessageLocationCode()
	 * @model ordered="false"
	 * @generated
	 */
	MessageLocation getMessageLocationCode();

	/**
	 * Sets the value of the '{@link data.grauml.graWsdl.WsdlMessage#getMessageLocationCode <em>Message Location Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Location Code</em>' attribute.
	 * @see data.grauml.graWsdl.MessageLocation
	 * @see #getMessageLocationCode()
	 * @generated
	 */
	void setMessageLocationCode(MessageLocation value);

} // WsdlMessage
