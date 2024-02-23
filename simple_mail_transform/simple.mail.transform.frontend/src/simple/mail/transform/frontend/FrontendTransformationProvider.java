/**
 * <copyright>
 * </copyright>
 */
package simple.mail.transform.frontend;



import com.ibm.xtools.transform.authoring.JETRule;
import com.ibm.xtools.transform.authoring.RootTransformation;
import com.ibm.xtools.transform.authoring.TransformationProvider;

import com.ibm.xtools.transform.core.AbstractTransform;
import com.ibm.xtools.transform.core.ITransformContext;
import com.ibm.xtools.transform.core.ITransformationDescriptor;

import org.eclipse.core.runtime.IStatus;
import simple.mail.transform.frontend.transforms.MainTransform;

public class FrontendTransformationProvider extends TransformationProvider {

    /**
   * The transformation id <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final String TRANSFORMATION = "simple.mail.transform.frontend.FrontendTransformation";//$NON-NLS-1$

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ibm.xtools.transform.core.AbstractTransformationProvider#createTransformation(com.ibm.xtools.transform.core.ITransformationDescriptor)
   * @generated
   */
  public AbstractTransform createTransformation(ITransformationDescriptor descriptor) {
    RootTransformation transform = null;
    if (TRANSFORMATION.equals(descriptor.getId())) {
      transform = createRootTransformation(descriptor);
    }
    return transform;
  }

    /**
     * Creates a root transformation. JET Transformation is invoked here
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param transform The root transformation
     * @!generated
     */
    protected RootTransformation createRootTransformation(ITransformationDescriptor descriptor) {
        return new RootTransformation(descriptor, new MainTransform()) {
        	@Override
        	protected void addPostProcessingRules() {
        		add(new JETRule("simple.mail.transform")); //$NON-NLS-1$
        	}
        };
    }

    /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ibm.xtools.transform.core.AbstractTransformationProvider#validateContext(com.ibm.xtools.transform.core.ITransformationDescriptor,
   *      com.ibm.xtools.transform.core.ITransformContext)
   * @generated
   */
  public IStatus validateContext(ITransformationDescriptor descriptor, ITransformContext context) {
    if (TRANSFORMATION.equals(descriptor.getId()))
      return FrontendTransformationValidator.INSTANCE.isValid(context);
    return null;
  }

}
