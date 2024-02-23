/**
 */
package simple.mail.transform.model.inputSchema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simple.mail.transform.model.inputSchema.Root#getMailingFolder <em>Mailing Folder</em>}</li>
 *   <li>{@link simple.mail.transform.model.inputSchema.Root#getCampaign <em>Campaign</em>}</li>
 * </ul>
 *
 * @see simple.mail.transform.model.inputSchema.InputSchemaPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Mailing Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mailing Folder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mailing Folder</em>' attribute.
	 * @see #setMailingFolder(String)
	 * @see simple.mail.transform.model.inputSchema.InputSchemaPackage#getRoot_MailingFolder()
	 * @model required="true"
	 * @generated
	 */
	String getMailingFolder();

	/**
	 * Sets the value of the '{@link simple.mail.transform.model.inputSchema.Root#getMailingFolder <em>Mailing Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mailing Folder</em>' attribute.
	 * @see #getMailingFolder()
	 * @generated
	 */
	void setMailingFolder(String value);

	/**
	 * Returns the value of the '<em><b>Campaign</b></em>' containment reference list.
	 * The list contents are of type {@link simple.mail.transform.model.inputSchema.Campaign}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Campaign</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Campaign</em>' containment reference list.
	 * @see simple.mail.transform.model.inputSchema.InputSchemaPackage#getRoot_Campaign()
	 * @model containment="true"
	 * @generated
	 */
	EList<Campaign> getCampaign();

} // Root
