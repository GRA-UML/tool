/**
 */
package org.ebxml.namespaces.trade.partner;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Characteristics Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.CharacteristicsType#isAuthenticated <em>Authenticated</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.CharacteristicsType#isAuthorized <em>Authorized</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.CharacteristicsType#isConfidentiality <em>Confidentiality</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.CharacteristicsType#isNonrepudiationOfOrigin <em>Nonrepudiation Of Origin</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.CharacteristicsType#isNonrepudiationOfReceipt <em>Nonrepudiation Of Receipt</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.CharacteristicsType#isSecureTransport <em>Secure Transport</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.CharacteristicsType#getSyncReplyMode <em>Sync Reply Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCharacteristicsType()
 * @model extendedMetaData="name='Characteristics_._type' kind='empty'"
 * @generated
 */
public interface CharacteristicsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Authenticated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authenticated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authenticated</em>' attribute.
	 * @see #isSetAuthenticated()
	 * @see #unsetAuthenticated()
	 * @see #setAuthenticated(boolean)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCharacteristicsType_Authenticated()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='authenticated'"
	 * @generated
	 */
	boolean isAuthenticated();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.CharacteristicsType#isAuthenticated <em>Authenticated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authenticated</em>' attribute.
	 * @see #isSetAuthenticated()
	 * @see #unsetAuthenticated()
	 * @see #isAuthenticated()
	 * @generated
	 */
	void setAuthenticated(boolean value);

	/**
	 * Unsets the value of the '{@link org.ebxml.namespaces.trade.partner.CharacteristicsType#isAuthenticated <em>Authenticated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAuthenticated()
	 * @see #isAuthenticated()
	 * @see #setAuthenticated(boolean)
	 * @generated
	 */
	void unsetAuthenticated();

	/**
	 * Returns whether the value of the '{@link org.ebxml.namespaces.trade.partner.CharacteristicsType#isAuthenticated <em>Authenticated</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Authenticated</em>' attribute is set.
	 * @see #unsetAuthenticated()
	 * @see #isAuthenticated()
	 * @see #setAuthenticated(boolean)
	 * @generated
	 */
	boolean isSetAuthenticated();

	/**
	 * Returns the value of the '<em><b>Authorized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorized</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorized</em>' attribute.
	 * @see #isSetAuthorized()
	 * @see #unsetAuthorized()
	 * @see #setAuthorized(boolean)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCharacteristicsType_Authorized()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='authorized'"
	 * @generated
	 */
	boolean isAuthorized();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.CharacteristicsType#isAuthorized <em>Authorized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorized</em>' attribute.
	 * @see #isSetAuthorized()
	 * @see #unsetAuthorized()
	 * @see #isAuthorized()
	 * @generated
	 */
	void setAuthorized(boolean value);

	/**
	 * Unsets the value of the '{@link org.ebxml.namespaces.trade.partner.CharacteristicsType#isAuthorized <em>Authorized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAuthorized()
	 * @see #isAuthorized()
	 * @see #setAuthorized(boolean)
	 * @generated
	 */
	void unsetAuthorized();

	/**
	 * Returns whether the value of the '{@link org.ebxml.namespaces.trade.partner.CharacteristicsType#isAuthorized <em>Authorized</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Authorized</em>' attribute is set.
	 * @see #unsetAuthorized()
	 * @see #isAuthorized()
	 * @see #setAuthorized(boolean)
	 * @generated
	 */
	boolean isSetAuthorized();

	/**
	 * Returns the value of the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confidentiality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidentiality</em>' attribute.
	 * @see #isSetConfidentiality()
	 * @see #unsetConfidentiality()
	 * @see #setConfidentiality(boolean)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCharacteristicsType_Confidentiality()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='confidentiality'"
	 * @generated
	 */
	boolean isConfidentiality();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.CharacteristicsType#isConfidentiality <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidentiality</em>' attribute.
	 * @see #isSetConfidentiality()
	 * @see #unsetConfidentiality()
	 * @see #isConfidentiality()
	 * @generated
	 */
	void setConfidentiality(boolean value);

	/**
	 * Unsets the value of the '{@link org.ebxml.namespaces.trade.partner.CharacteristicsType#isConfidentiality <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConfidentiality()
	 * @see #isConfidentiality()
	 * @see #setConfidentiality(boolean)
	 * @generated
	 */
	void unsetConfidentiality();

	/**
	 * Returns whether the value of the '{@link org.ebxml.namespaces.trade.partner.CharacteristicsType#isConfidentiality <em>Confidentiality</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Confidentiality</em>' attribute is set.
	 * @see #unsetConfidentiality()
	 * @see #isConfidentiality()
	 * @see #setConfidentiality(boolean)
	 * @generated
	 */
	boolean isSetConfidentiality();

	/**
	 * Returns the value of the '<em><b>Nonrepudiation Of Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nonrepudiation Of Origin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nonrepudiation Of Origin</em>' attribute.
	 * @see #isSetNonrepudiationOfOrigin()
	 * @see #unsetNonrepudiationOfOrigin()
	 * @see #setNonrepudiationOfOrigin(boolean)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCharacteristicsType_NonrepudiationOfOrigin()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='nonrepudiationOfOrigin'"
	 * @generated
	 */
	boolean isNonrepudiationOfOrigin();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.CharacteristicsType#isNonrepudiationOfOrigin <em>Nonrepudiation Of Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nonrepudiation Of Origin</em>' attribute.
	 * @see #isSetNonrepudiationOfOrigin()
	 * @see #unsetNonrepudiationOfOrigin()
	 * @see #isNonrepudiationOfOrigin()
	 * @generated
	 */
	void setNonrepudiationOfOrigin(boolean value);

	/**
	 * Unsets the value of the '{@link org.ebxml.namespaces.trade.partner.CharacteristicsType#isNonrepudiationOfOrigin <em>Nonrepudiation Of Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNonrepudiationOfOrigin()
	 * @see #isNonrepudiationOfOrigin()
	 * @see #setNonrepudiationOfOrigin(boolean)
	 * @generated
	 */
	void unsetNonrepudiationOfOrigin();

	/**
	 * Returns whether the value of the '{@link org.ebxml.namespaces.trade.partner.CharacteristicsType#isNonrepudiationOfOrigin <em>Nonrepudiation Of Origin</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nonrepudiation Of Origin</em>' attribute is set.
	 * @see #unsetNonrepudiationOfOrigin()
	 * @see #isNonrepudiationOfOrigin()
	 * @see #setNonrepudiationOfOrigin(boolean)
	 * @generated
	 */
	boolean isSetNonrepudiationOfOrigin();

	/**
	 * Returns the value of the '<em><b>Nonrepudiation Of Receipt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nonrepudiation Of Receipt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nonrepudiation Of Receipt</em>' attribute.
	 * @see #isSetNonrepudiationOfReceipt()
	 * @see #unsetNonrepudiationOfReceipt()
	 * @see #setNonrepudiationOfReceipt(boolean)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCharacteristicsType_NonrepudiationOfReceipt()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='nonrepudiationOfReceipt'"
	 * @generated
	 */
	boolean isNonrepudiationOfReceipt();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.CharacteristicsType#isNonrepudiationOfReceipt <em>Nonrepudiation Of Receipt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nonrepudiation Of Receipt</em>' attribute.
	 * @see #isSetNonrepudiationOfReceipt()
	 * @see #unsetNonrepudiationOfReceipt()
	 * @see #isNonrepudiationOfReceipt()
	 * @generated
	 */
	void setNonrepudiationOfReceipt(boolean value);

	/**
	 * Unsets the value of the '{@link org.ebxml.namespaces.trade.partner.CharacteristicsType#isNonrepudiationOfReceipt <em>Nonrepudiation Of Receipt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNonrepudiationOfReceipt()
	 * @see #isNonrepudiationOfReceipt()
	 * @see #setNonrepudiationOfReceipt(boolean)
	 * @generated
	 */
	void unsetNonrepudiationOfReceipt();

	/**
	 * Returns whether the value of the '{@link org.ebxml.namespaces.trade.partner.CharacteristicsType#isNonrepudiationOfReceipt <em>Nonrepudiation Of Receipt</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nonrepudiation Of Receipt</em>' attribute is set.
	 * @see #unsetNonrepudiationOfReceipt()
	 * @see #isNonrepudiationOfReceipt()
	 * @see #setNonrepudiationOfReceipt(boolean)
	 * @generated
	 */
	boolean isSetNonrepudiationOfReceipt();

	/**
	 * Returns the value of the '<em><b>Secure Transport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secure Transport</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secure Transport</em>' attribute.
	 * @see #isSetSecureTransport()
	 * @see #unsetSecureTransport()
	 * @see #setSecureTransport(boolean)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCharacteristicsType_SecureTransport()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='secureTransport'"
	 * @generated
	 */
	boolean isSecureTransport();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.CharacteristicsType#isSecureTransport <em>Secure Transport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secure Transport</em>' attribute.
	 * @see #isSetSecureTransport()
	 * @see #unsetSecureTransport()
	 * @see #isSecureTransport()
	 * @generated
	 */
	void setSecureTransport(boolean value);

	/**
	 * Unsets the value of the '{@link org.ebxml.namespaces.trade.partner.CharacteristicsType#isSecureTransport <em>Secure Transport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecureTransport()
	 * @see #isSecureTransport()
	 * @see #setSecureTransport(boolean)
	 * @generated
	 */
	void unsetSecureTransport();

	/**
	 * Returns whether the value of the '{@link org.ebxml.namespaces.trade.partner.CharacteristicsType#isSecureTransport <em>Secure Transport</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Secure Transport</em>' attribute is set.
	 * @see #unsetSecureTransport()
	 * @see #isSecureTransport()
	 * @see #setSecureTransport(boolean)
	 * @generated
	 */
	boolean isSetSecureTransport();

	/**
	 * Returns the value of the '<em><b>Sync Reply Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.ebxml.namespaces.trade.partner.SyncReplyModeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sync Reply Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sync Reply Mode</em>' attribute.
	 * @see org.ebxml.namespaces.trade.partner.SyncReplyModeType
	 * @see #isSetSyncReplyMode()
	 * @see #unsetSyncReplyMode()
	 * @see #setSyncReplyMode(SyncReplyModeType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCharacteristicsType_SyncReplyMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='syncReplyMode' namespace='##targetNamespace'"
	 * @generated
	 */
	SyncReplyModeType getSyncReplyMode();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.CharacteristicsType#getSyncReplyMode <em>Sync Reply Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sync Reply Mode</em>' attribute.
	 * @see org.ebxml.namespaces.trade.partner.SyncReplyModeType
	 * @see #isSetSyncReplyMode()
	 * @see #unsetSyncReplyMode()
	 * @see #getSyncReplyMode()
	 * @generated
	 */
	void setSyncReplyMode(SyncReplyModeType value);

	/**
	 * Unsets the value of the '{@link org.ebxml.namespaces.trade.partner.CharacteristicsType#getSyncReplyMode <em>Sync Reply Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSyncReplyMode()
	 * @see #getSyncReplyMode()
	 * @see #setSyncReplyMode(SyncReplyModeType)
	 * @generated
	 */
	void unsetSyncReplyMode();

	/**
	 * Returns whether the value of the '{@link org.ebxml.namespaces.trade.partner.CharacteristicsType#getSyncReplyMode <em>Sync Reply Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sync Reply Mode</em>' attribute is set.
	 * @see #unsetSyncReplyMode()
	 * @see #getSyncReplyMode()
	 * @see #setSyncReplyMode(SyncReplyModeType)
	 * @generated
	 */
	boolean isSetSyncReplyMode();

} // CharacteristicsType
