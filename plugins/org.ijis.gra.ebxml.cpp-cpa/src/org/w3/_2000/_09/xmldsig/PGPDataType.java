/**
 */
package org.w3._2000._09.xmldsig;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PGP Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3._2000._09.xmldsig.PGPDataType#getAny <em>Any</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.PGPDataType#getPGPKeyID <em>PGP Key ID</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.PGPDataType#getPGPKeyPacket <em>PGP Key Packet</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getPGPDataType()
 * @model extendedMetaData="name='PGPData_._type' kind='elementOnly'"
 * @generated
 */
public interface PGPDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getPGPDataType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':0' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>PGP Key ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PGP Key ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PGP Key ID</em>' attribute.
	 * @see #setPGPKeyID(String)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getPGPDataType_PGPKeyID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='PGPKeyID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPGPKeyID();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.PGPDataType#getPGPKeyID <em>PGP Key ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PGP Key ID</em>' attribute.
	 * @see #getPGPKeyID()
	 * @generated
	 */
	void setPGPKeyID(String value);

	/**
	 * Returns the value of the '<em><b>PGP Key Packet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PGP Key Packet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PGP Key Packet</em>' attribute.
	 * @see #setPGPKeyPacket(byte[])
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getPGPDataType_PGPKeyPacket()
	 * @model dataType="org.w3._2000._09.xmldsig.CryptoBinary"
	 *        extendedMetaData="kind='element' name='PGPKeyPacket' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getPGPKeyPacket();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.PGPDataType#getPGPKeyPacket <em>PGP Key Packet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PGP Key Packet</em>' attribute.
	 * @see #getPGPKeyPacket()
	 * @generated
	 */
	void setPGPKeyPacket(byte[] value);

} // PGPDataType
