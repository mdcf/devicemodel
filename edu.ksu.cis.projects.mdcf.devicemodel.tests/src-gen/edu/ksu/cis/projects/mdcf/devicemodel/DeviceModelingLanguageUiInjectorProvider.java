/*
* generated by Xtext
*/
package edu.ksu.cis.projects.mdcf.devicemodel;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class DeviceModelingLanguageUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return edu.ksu.cis.projects.mdcf.devicemodel.ui.internal.DeviceModelingLanguageActivator.getInstance().getInjector("edu.ksu.cis.projects.mdcf.devicemodel.DeviceModelingLanguage");
	}
	
}
