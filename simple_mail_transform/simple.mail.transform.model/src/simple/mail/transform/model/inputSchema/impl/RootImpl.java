/**
 */
package simple.mail.transform.model.inputSchema.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import simple.mail.transform.model.inputSchema.Campaign;
import simple.mail.transform.model.inputSchema.InputSchemaPackage;
import simple.mail.transform.model.inputSchema.Root;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simple.mail.transform.model.inputSchema.impl.RootImpl#getMailingFolder <em>Mailing Folder</em>}</li>
 *   <li>{@link simple.mail.transform.model.inputSchema.impl.RootImpl#getCampaign <em>Campaign</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootImpl extends EObjectImpl implements Root {
	/**
	 * The default value of the '{@link #getMailingFolder() <em>Mailing Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMailingFolder()
	 * @generated
	 * @ordered
	 */
	protected static final String MAILING_FOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMailingFolder() <em>Mailing Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMailingFolder()
	 * @generated
	 * @ordered
	 */
	protected String mailingFolder = MAILING_FOLDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCampaign() <em>Campaign</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCampaign()
	 * @generated
	 * @ordered
	 */
	protected EList<Campaign> campaign;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InputSchemaPackage.Literals.ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMailingFolder() {
		return mailingFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMailingFolder(String newMailingFolder) {
		String oldMailingFolder = mailingFolder;
		mailingFolder = newMailingFolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InputSchemaPackage.ROOT__MAILING_FOLDER, oldMailingFolder, mailingFolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Campaign> getCampaign() {
		if (campaign == null) {
			campaign = new EObjectContainmentEList<Campaign>(Campaign.class, this, InputSchemaPackage.ROOT__CAMPAIGN);
		}
		return campaign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InputSchemaPackage.ROOT__CAMPAIGN:
				return ((InternalEList<?>)getCampaign()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InputSchemaPackage.ROOT__MAILING_FOLDER:
				return getMailingFolder();
			case InputSchemaPackage.ROOT__CAMPAIGN:
				return getCampaign();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InputSchemaPackage.ROOT__MAILING_FOLDER:
				setMailingFolder((String)newValue);
				return;
			case InputSchemaPackage.ROOT__CAMPAIGN:
				getCampaign().clear();
				getCampaign().addAll((Collection<? extends Campaign>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case InputSchemaPackage.ROOT__MAILING_FOLDER:
				setMailingFolder(MAILING_FOLDER_EDEFAULT);
				return;
			case InputSchemaPackage.ROOT__CAMPAIGN:
				getCampaign().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InputSchemaPackage.ROOT__MAILING_FOLDER:
				return MAILING_FOLDER_EDEFAULT == null ? mailingFolder != null : !MAILING_FOLDER_EDEFAULT.equals(mailingFolder);
			case InputSchemaPackage.ROOT__CAMPAIGN:
				return campaign != null && !campaign.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mailingFolder: ");
		result.append(mailingFolder);
		result.append(')');
		return result.toString();
	}

} //RootImpl
