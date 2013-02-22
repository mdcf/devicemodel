package edu.ksu.cis.projects.mdcf.devicemodel.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public class AbstractDeviceModelingLanguageJavaValidator extends AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage.eINSTANCE);
		return result;
	}

}
