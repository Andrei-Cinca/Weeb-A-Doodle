/*
 * generated by Xtext 2.29.0
 */
package kcl.ac.uk.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractWeebADoodleValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(kcl.ac.uk.weebADoodle.WeebADoodlePackage.eINSTANCE);
		return result;
	}
}