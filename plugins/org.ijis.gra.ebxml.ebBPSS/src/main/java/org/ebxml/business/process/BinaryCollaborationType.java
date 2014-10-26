/**
 */
package org.ebxml.business.process;

import javax.xml.datatype.Duration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Collaboration Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.business.process.BinaryCollaborationType#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ebxml.business.process.BinaryCollaborationType#getInitiatingRole <em>Initiating Role</em>}</li>
 *   <li>{@link org.ebxml.business.process.BinaryCollaborationType#getRespondingRole <em>Responding Role</em>}</li>
 *   <li>{@link org.ebxml.business.process.BinaryCollaborationType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.ebxml.business.process.BinaryCollaborationType#getDocumentation1 <em>Documentation1</em>}</li>
 *   <li>{@link org.ebxml.business.process.BinaryCollaborationType#getStart <em>Start</em>}</li>
 *   <li>{@link org.ebxml.business.process.BinaryCollaborationType#getTransition <em>Transition</em>}</li>
 *   <li>{@link org.ebxml.business.process.BinaryCollaborationType#getSuccess <em>Success</em>}</li>
 *   <li>{@link org.ebxml.business.process.BinaryCollaborationType#getFailure <em>Failure</em>}</li>
 *   <li>{@link org.ebxml.business.process.BinaryCollaborationType#getBusinessTransactionActivity <em>Business Transaction Activity</em>}</li>
 *   <li>{@link org.ebxml.business.process.BinaryCollaborationType#getCollaborationActivity <em>Collaboration Activity</em>}</li>
 *   <li>{@link org.ebxml.business.process.BinaryCollaborationType#getFork <em>Fork</em>}</li>
 *   <li>{@link org.ebxml.business.process.BinaryCollaborationType#getJoin <em>Join</em>}</li>
 *   <li>{@link org.ebxml.business.process.BinaryCollaborationType#getBeginsWhen <em>Begins When</em>}</li>
 *   <li>{@link org.ebxml.business.process.BinaryCollaborationType#getEndsWhen <em>Ends When</em>}</li>
 *   <li>{@link org.ebxml.business.process.BinaryCollaborationType#getName <em>Name</em>}</li>
 *   <li>{@link org.ebxml.business.process.BinaryCollaborationType#getNameID <em>Name ID</em>}</li>
 *   <li>{@link org.ebxml.business.process.BinaryCollaborationType#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.ebxml.business.process.BinaryCollaborationType#getPostCondition <em>Post Condition</em>}</li>
 *   <li>{@link org.ebxml.business.process.BinaryCollaborationType#getPreCondition <em>Pre Condition</em>}</li>
 *   <li>{@link org.ebxml.business.process.BinaryCollaborationType#getTimeToPerform <em>Time To Perform</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.business.process.ProcessPackage#getBinaryCollaborationType()
 * @model extendedMetaData="name='BinaryCollaboration_._type' kind='elementOnly'"
 * @generated
 */
public interface BinaryCollaborationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.business.process.DocumentationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference list.
	 * @see org.ebxml.business.process.ProcessPackage#getBinaryCollaborationType_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DocumentationType> getDocumentation();

	/**
	 * Returns the value of the '<em><b>Initiating Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initiating Role</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initiating Role</em>' containment reference.
	 * @see #setInitiatingRole(InitiatingRoleType)
	 * @see org.ebxml.business.process.ProcessPackage#getBinaryCollaborationType_InitiatingRole()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='InitiatingRole' namespace='##targetNamespace'"
	 * @generated
	 */
	InitiatingRoleType getInitiatingRole();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.BinaryCollaborationType#getInitiatingRole <em>Initiating Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiating Role</em>' containment reference.
	 * @see #getInitiatingRole()
	 * @generated
	 */
	void setInitiatingRole(InitiatingRoleType value);

	/**
	 * Returns the value of the '<em><b>Responding Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responding Role</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responding Role</em>' containment reference.
	 * @see #setRespondingRole(RespondingRoleType)
	 * @see org.ebxml.business.process.ProcessPackage#getBinaryCollaborationType_RespondingRole()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RespondingRole' namespace='##targetNamespace'"
	 * @generated
	 */
	RespondingRoleType getRespondingRole();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.BinaryCollaborationType#getRespondingRole <em>Responding Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responding Role</em>' containment reference.
	 * @see #getRespondingRole()
	 * @generated
	 */
	void setRespondingRole(RespondingRoleType value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.ebxml.business.process.ProcessPackage#getBinaryCollaborationType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:3'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Documentation1</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.business.process.DocumentationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation1</em>' containment reference list.
	 * @see org.ebxml.business.process.ProcessPackage#getBinaryCollaborationType_Documentation1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Documentation' namespace='##targetNamespace' group='#group:3'"
	 * @generated
	 */
	EList<DocumentationType> getDocumentation1();

	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.business.process.StartType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference list.
	 * @see org.ebxml.business.process.ProcessPackage#getBinaryCollaborationType_Start()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Start' namespace='##targetNamespace' group='#group:3'"
	 * @generated
	 */
	EList<StartType> getStart();

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.business.process.TransitionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see org.ebxml.business.process.ProcessPackage#getBinaryCollaborationType_Transition()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Transition' namespace='##targetNamespace' group='#group:3'"
	 * @generated
	 */
	EList<TransitionType> getTransition();

	/**
	 * Returns the value of the '<em><b>Success</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.business.process.SuccessType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Success</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Success</em>' containment reference list.
	 * @see org.ebxml.business.process.ProcessPackage#getBinaryCollaborationType_Success()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Success' namespace='##targetNamespace' group='#group:3'"
	 * @generated
	 */
	EList<SuccessType> getSuccess();

	/**
	 * Returns the value of the '<em><b>Failure</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.business.process.FailureType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure</em>' containment reference list.
	 * @see org.ebxml.business.process.ProcessPackage#getBinaryCollaborationType_Failure()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Failure' namespace='##targetNamespace' group='#group:3'"
	 * @generated
	 */
	EList<FailureType> getFailure();

	/**
	 * Returns the value of the '<em><b>Business Transaction Activity</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.business.process.BusinessTransactionActivityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Transaction Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Transaction Activity</em>' containment reference list.
	 * @see org.ebxml.business.process.ProcessPackage#getBinaryCollaborationType_BusinessTransactionActivity()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BusinessTransactionActivity' namespace='##targetNamespace' group='#group:3'"
	 * @generated
	 */
	EList<BusinessTransactionActivityType> getBusinessTransactionActivity();

	/**
	 * Returns the value of the '<em><b>Collaboration Activity</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.business.process.CollaborationActivityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collaboration Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collaboration Activity</em>' containment reference list.
	 * @see org.ebxml.business.process.ProcessPackage#getBinaryCollaborationType_CollaborationActivity()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CollaborationActivity' namespace='##targetNamespace' group='#group:3'"
	 * @generated
	 */
	EList<CollaborationActivityType> getCollaborationActivity();

	/**
	 * Returns the value of the '<em><b>Fork</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.business.process.ForkType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fork</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fork</em>' containment reference list.
	 * @see org.ebxml.business.process.ProcessPackage#getBinaryCollaborationType_Fork()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Fork' namespace='##targetNamespace' group='#group:3'"
	 * @generated
	 */
	EList<ForkType> getFork();

	/**
	 * Returns the value of the '<em><b>Join</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.business.process.JoinType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join</em>' containment reference list.
	 * @see org.ebxml.business.process.ProcessPackage#getBinaryCollaborationType_Join()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Join' namespace='##targetNamespace' group='#group:3'"
	 * @generated
	 */
	EList<JoinType> getJoin();

	/**
	 * Returns the value of the '<em><b>Begins When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Begins When</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begins When</em>' attribute.
	 * @see #setBeginsWhen(String)
	 * @see org.ebxml.business.process.ProcessPackage#getBinaryCollaborationType_BeginsWhen()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='beginsWhen'"
	 * @generated
	 */
	String getBeginsWhen();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.BinaryCollaborationType#getBeginsWhen <em>Begins When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begins When</em>' attribute.
	 * @see #getBeginsWhen()
	 * @generated
	 */
	void setBeginsWhen(String value);

	/**
	 * Returns the value of the '<em><b>Ends When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ends When</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ends When</em>' attribute.
	 * @see #setEndsWhen(String)
	 * @see org.ebxml.business.process.ProcessPackage#getBinaryCollaborationType_EndsWhen()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='endsWhen'"
	 * @generated
	 */
	String getEndsWhen();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.BinaryCollaborationType#getEndsWhen <em>Ends When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ends When</em>' attribute.
	 * @see #getEndsWhen()
	 * @generated
	 */
	void setEndsWhen(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.ebxml.business.process.ProcessPackage#getBinaryCollaborationType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.BinaryCollaborationType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Name ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name ID</em>' attribute.
	 * @see #setNameID(String)
	 * @see org.ebxml.business.process.ProcessPackage#getBinaryCollaborationType_NameID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='nameID'"
	 * @generated
	 */
	String getNameID();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.BinaryCollaborationType#getNameID <em>Name ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name ID</em>' attribute.
	 * @see #getNameID()
	 * @generated
	 */
	void setNameID(String value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see #setPattern(String)
	 * @see org.ebxml.business.process.ProcessPackage#getBinaryCollaborationType_Pattern()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='pattern'"
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.BinaryCollaborationType#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(String value);

	/**
	 * Returns the value of the '<em><b>Post Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Condition</em>' attribute.
	 * @see #setPostCondition(String)
	 * @see org.ebxml.business.process.ProcessPackage#getBinaryCollaborationType_PostCondition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='postCondition'"
	 * @generated
	 */
	String getPostCondition();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.BinaryCollaborationType#getPostCondition <em>Post Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Condition</em>' attribute.
	 * @see #getPostCondition()
	 * @generated
	 */
	void setPostCondition(String value);

	/**
	 * Returns the value of the '<em><b>Pre Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Condition</em>' attribute.
	 * @see #setPreCondition(String)
	 * @see org.ebxml.business.process.ProcessPackage#getBinaryCollaborationType_PreCondition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='preCondition'"
	 * @generated
	 */
	String getPreCondition();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.BinaryCollaborationType#getPreCondition <em>Pre Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Condition</em>' attribute.
	 * @see #getPreCondition()
	 * @generated
	 */
	void setPreCondition(String value);

	/**
	 * Returns the value of the '<em><b>Time To Perform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time To Perform</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time To Perform</em>' attribute.
	 * @see #setTimeToPerform(Duration)
	 * @see org.ebxml.business.process.ProcessPackage#getBinaryCollaborationType_TimeToPerform()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='attribute' name='timeToPerform'"
	 * @generated
	 */
	Duration getTimeToPerform();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.BinaryCollaborationType#getTimeToPerform <em>Time To Perform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time To Perform</em>' attribute.
	 * @see #getTimeToPerform()
	 * @generated
	 */
	void setTimeToPerform(Duration value);

} // BinaryCollaborationType
