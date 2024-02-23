/**
 */
package simple.mail.transform.model.inputSchema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Campaign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simple.mail.transform.model.inputSchema.Campaign#getMailing <em>Mailing</em>}</li>
 *   <li>{@link simple.mail.transform.model.inputSchema.Campaign#getProject <em>Project</em>}</li>
 * </ul>
 *
 * @see simple.mail.transform.model.inputSchema.InputSchemaPackage#getCampaign()
 * @model
 * @generated
 */
public interface Campaign extends EObject {
	/**
	 * Returns the value of the '<em><b>Mailing</b></em>' containment reference list.
	 * The list contents are of type {@link simple.mail.transform.model.inputSchema.Mailing}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mailing</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mailing</em>' containment reference list.
	 * @see simple.mail.transform.model.inputSchema.InputSchemaPackage#getCampaign_Mailing()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mailing> getMailing();

	/**
	 * Returns the value of the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' attribute.
	 * @see #setProject(String)
	 * @see simple.mail.transform.model.inputSchema.InputSchemaPackage#getCampaign_Project()
	 * @model required="true"
	 * @generated
	 */
	String getProject();

	/**
	 * Sets the value of the '{@link simple.mail.transform.model.inputSchema.Campaign#getProject <em>Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' attribute.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(String value);

} // Campaign
