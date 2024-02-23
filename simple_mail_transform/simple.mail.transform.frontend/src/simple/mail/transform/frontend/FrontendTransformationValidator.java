/**
 * <copyright>
 * </copyright>
 */
package simple.mail.transform.frontend;


import com.ibm.xtools.transform.authoring.TransformationValidator;


/**
 * A helper class that provides validation services to the transform and its
 * provider <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class FrontendTransformationValidator extends TransformationValidator {

	/**
	 * The singleton instance <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static FrontendTransformationValidator INSTANCE = new FrontendTransformationValidator();

	/**
	 * The private constructor <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private FrontendTransformationValidator() {
		// empty
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected String getPluginID() {
		return "simple.mail.transform.frontend"; //$NON-NLS-1$
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.ibm.xtools.transform.authoring.TransformationValidator#isSourceElementValid(java.lang.Object)
	 * @generated
	 */
	protected boolean isSourceElementValid(Object source) {
		// Remove @generated tag to add more source validation checks
		return super.isSourceElementValid(source);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.ibm.xtools.transform.authoring.TransformationValidator#isTargetElementValid(java.lang.Object)
	 * @generated
	 */
	protected boolean isTargetElementValid(Object target) {
		// Replace this default validation test (for target elements of type = resource)
		// with one for target elements of type = (raw) and remove the @generated tag
		return super.isTargetElementValid(target);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.ibm.xtools.transform.authoring.TransformationValidator#isAuxiliarySourceURIValid(java.lang.String)
	 * @generated
	 */
	protected boolean isAuxiliarySourceURIValid(String auxiliarySourceURI) {
		// Remove @generated tag to add more auxiliary source validation checks
		return super.isAuxiliarySourceURIValid(auxiliarySourceURI);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.ibm.xtools.transform.authoring.TransformationValidator#isAuxiliaryTargetURIValid(java.lang.String)
	 * @generated
	 */
	protected boolean isAuxiliaryTargetURIValid(String auxiliaryTargetURI) {
		// Remove @generated tag to add more auxiliary target validation checks
		return super.isAuxiliaryTargetURIValid(auxiliaryTargetURI);
	}

}
