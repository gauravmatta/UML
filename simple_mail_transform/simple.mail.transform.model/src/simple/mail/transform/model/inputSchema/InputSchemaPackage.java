/**
 */
package simple.mail.transform.model.inputSchema;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see simple.mail.transform.model.inputSchema.InputSchemaFactory
 * @model kind="package"
 * @generated
 */
public interface InputSchemaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "inputSchema";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://transform.mail.simple/inputSchema/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "inputSchema";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InputSchemaPackage eINSTANCE = simple.mail.transform.model.inputSchema.impl.InputSchemaPackageImpl.init();

	/**
	 * The meta object id for the '{@link simple.mail.transform.model.inputSchema.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simple.mail.transform.model.inputSchema.impl.RootImpl
	 * @see simple.mail.transform.model.inputSchema.impl.InputSchemaPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 0;

	/**
	 * The feature id for the '<em><b>Mailing Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__MAILING_FOLDER = 0;

	/**
	 * The feature id for the '<em><b>Campaign</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__CAMPAIGN = 1;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link simple.mail.transform.model.inputSchema.impl.MailingImpl <em>Mailing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simple.mail.transform.model.inputSchema.impl.MailingImpl
	 * @see simple.mail.transform.model.inputSchema.impl.InputSchemaPackageImpl#getMailing()
	 * @generated
	 */
	int MAILING = 1;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILING__EMAIL = 0;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILING__FIRST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILING__LAST_NAME = 2;

	/**
	 * The feature id for the '<em><b>Interest</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILING__INTEREST = 3;

	/**
	 * The number of structural features of the '<em>Mailing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILING_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link simple.mail.transform.model.inputSchema.impl.CampaignImpl <em>Campaign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simple.mail.transform.model.inputSchema.impl.CampaignImpl
	 * @see simple.mail.transform.model.inputSchema.impl.InputSchemaPackageImpl#getCampaign()
	 * @generated
	 */
	int CAMPAIGN = 2;

	/**
	 * The feature id for the '<em><b>Mailing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN__MAILING = 0;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN__PROJECT = 1;

	/**
	 * The number of structural features of the '<em>Campaign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link simple.mail.transform.model.inputSchema.impl.InterestImpl <em>Interest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simple.mail.transform.model.inputSchema.impl.InterestImpl
	 * @see simple.mail.transform.model.inputSchema.impl.InputSchemaPackageImpl#getInterest()
	 * @generated
	 */
	int INTEREST = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST__CODE = 0;

	/**
	 * The number of structural features of the '<em>Interest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link simple.mail.transform.model.inputSchema.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see simple.mail.transform.model.inputSchema.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the attribute '{@link simple.mail.transform.model.inputSchema.Root#getMailingFolder <em>Mailing Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mailing Folder</em>'.
	 * @see simple.mail.transform.model.inputSchema.Root#getMailingFolder()
	 * @see #getRoot()
	 * @generated
	 */
	EAttribute getRoot_MailingFolder();

	/**
	 * Returns the meta object for the containment reference list '{@link simple.mail.transform.model.inputSchema.Root#getCampaign <em>Campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Campaign</em>'.
	 * @see simple.mail.transform.model.inputSchema.Root#getCampaign()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Campaign();

	/**
	 * Returns the meta object for class '{@link simple.mail.transform.model.inputSchema.Mailing <em>Mailing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mailing</em>'.
	 * @see simple.mail.transform.model.inputSchema.Mailing
	 * @generated
	 */
	EClass getMailing();

	/**
	 * Returns the meta object for the attribute '{@link simple.mail.transform.model.inputSchema.Mailing#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see simple.mail.transform.model.inputSchema.Mailing#getEmail()
	 * @see #getMailing()
	 * @generated
	 */
	EAttribute getMailing_Email();

	/**
	 * Returns the meta object for the attribute '{@link simple.mail.transform.model.inputSchema.Mailing#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see simple.mail.transform.model.inputSchema.Mailing#getFirstName()
	 * @see #getMailing()
	 * @generated
	 */
	EAttribute getMailing_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link simple.mail.transform.model.inputSchema.Mailing#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see simple.mail.transform.model.inputSchema.Mailing#getLastName()
	 * @see #getMailing()
	 * @generated
	 */
	EAttribute getMailing_LastName();

	/**
	 * Returns the meta object for the containment reference list '{@link simple.mail.transform.model.inputSchema.Mailing#getInterest <em>Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interest</em>'.
	 * @see simple.mail.transform.model.inputSchema.Mailing#getInterest()
	 * @see #getMailing()
	 * @generated
	 */
	EReference getMailing_Interest();

	/**
	 * Returns the meta object for class '{@link simple.mail.transform.model.inputSchema.Campaign <em>Campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Campaign</em>'.
	 * @see simple.mail.transform.model.inputSchema.Campaign
	 * @generated
	 */
	EClass getCampaign();

	/**
	 * Returns the meta object for the containment reference list '{@link simple.mail.transform.model.inputSchema.Campaign#getMailing <em>Mailing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mailing</em>'.
	 * @see simple.mail.transform.model.inputSchema.Campaign#getMailing()
	 * @see #getCampaign()
	 * @generated
	 */
	EReference getCampaign_Mailing();

	/**
	 * Returns the meta object for the attribute '{@link simple.mail.transform.model.inputSchema.Campaign#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project</em>'.
	 * @see simple.mail.transform.model.inputSchema.Campaign#getProject()
	 * @see #getCampaign()
	 * @generated
	 */
	EAttribute getCampaign_Project();

	/**
	 * Returns the meta object for class '{@link simple.mail.transform.model.inputSchema.Interest <em>Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interest</em>'.
	 * @see simple.mail.transform.model.inputSchema.Interest
	 * @generated
	 */
	EClass getInterest();

	/**
	 * Returns the meta object for the attribute '{@link simple.mail.transform.model.inputSchema.Interest#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see simple.mail.transform.model.inputSchema.Interest#getCode()
	 * @see #getInterest()
	 * @generated
	 */
	EAttribute getInterest_Code();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InputSchemaFactory getInputSchemaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link simple.mail.transform.model.inputSchema.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simple.mail.transform.model.inputSchema.impl.RootImpl
		 * @see simple.mail.transform.model.inputSchema.impl.InputSchemaPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Mailing Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOT__MAILING_FOLDER = eINSTANCE.getRoot_MailingFolder();

		/**
		 * The meta object literal for the '<em><b>Campaign</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__CAMPAIGN = eINSTANCE.getRoot_Campaign();

		/**
		 * The meta object literal for the '{@link simple.mail.transform.model.inputSchema.impl.MailingImpl <em>Mailing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simple.mail.transform.model.inputSchema.impl.MailingImpl
		 * @see simple.mail.transform.model.inputSchema.impl.InputSchemaPackageImpl#getMailing()
		 * @generated
		 */
		EClass MAILING = eINSTANCE.getMailing();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAILING__EMAIL = eINSTANCE.getMailing_Email();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAILING__FIRST_NAME = eINSTANCE.getMailing_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAILING__LAST_NAME = eINSTANCE.getMailing_LastName();

		/**
		 * The meta object literal for the '<em><b>Interest</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAILING__INTEREST = eINSTANCE.getMailing_Interest();

		/**
		 * The meta object literal for the '{@link simple.mail.transform.model.inputSchema.impl.CampaignImpl <em>Campaign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simple.mail.transform.model.inputSchema.impl.CampaignImpl
		 * @see simple.mail.transform.model.inputSchema.impl.InputSchemaPackageImpl#getCampaign()
		 * @generated
		 */
		EClass CAMPAIGN = eINSTANCE.getCampaign();

		/**
		 * The meta object literal for the '<em><b>Mailing</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMPAIGN__MAILING = eINSTANCE.getCampaign_Mailing();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPAIGN__PROJECT = eINSTANCE.getCampaign_Project();

		/**
		 * The meta object literal for the '{@link simple.mail.transform.model.inputSchema.impl.InterestImpl <em>Interest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simple.mail.transform.model.inputSchema.impl.InterestImpl
		 * @see simple.mail.transform.model.inputSchema.impl.InputSchemaPackageImpl#getInterest()
		 * @generated
		 */
		EClass INTEREST = eINSTANCE.getInterest();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEREST__CODE = eINSTANCE.getInterest_Code();

	}

} //InputSchemaPackage
