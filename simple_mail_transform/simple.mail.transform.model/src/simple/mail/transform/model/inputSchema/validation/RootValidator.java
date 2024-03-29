/**
 *
 * $Id$
 */
package simple.mail.transform.model.inputSchema.validation;

import org.eclipse.emf.common.util.EList;

import simple.mail.transform.model.inputSchema.Campaign;

/**
 * A sample validator interface for {@link simple.mail.transform.model.inputSchema.Root}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RootValidator {
	boolean validate();

	boolean validateMailingFolder(String value);
	boolean validateCampaign(EList<Campaign> value);
}
