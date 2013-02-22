
package edu.ksu.cis.projects.mdcf.devicemodel;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class DeviceModelingLanguageStandaloneSetup extends DeviceModelingLanguageStandaloneSetupGenerated{

	public static void doSetup() {
		new DeviceModelingLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

