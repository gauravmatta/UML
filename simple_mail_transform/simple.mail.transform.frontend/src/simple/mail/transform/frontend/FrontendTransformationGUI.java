/**
 * <copyright>
 * </copyright>
 */
package simple.mail.transform.frontend;


import com.ibm.xtools.transform.authoring.TransformationGUI;

import com.ibm.xtools.transform.core.ITransformationDescriptor;


/**
 * <!-- begin-user-doc --> A class that supplies the GUI of the transformation
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class FrontendTransformationGUI extends TransformationGUI {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.ibm.xtools.transform.ui.AbstractTransformGUI#showInSourceTree(com.ibm.xtools.transform.core.ITransformationDescriptor,
	 *      java.lang.Object)
	 * @generated
	 */
	public boolean showInSourceTree(ITransformationDescriptor transformationDescriptor, Object suggestedSource) {
		return FrontendTransformationValidator.INSTANCE.isSourceElementValid(suggestedSource);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.ibm.xtools.transform.ui.AbstractTransformGUI#showInTargetContainerTree(com.ibm.xtools.transform.core.ITransformationDescriptor,
	 *      java.lang.Object)
	 * @generated
	 */
	public boolean showInTargetContainerTree(ITransformationDescriptor transformationDescriptor,
			Object suggestedTargetContainer) {
		return FrontendTransformationValidator.INSTANCE.isTargetElementValid(suggestedTargetContainer);
	}
}
