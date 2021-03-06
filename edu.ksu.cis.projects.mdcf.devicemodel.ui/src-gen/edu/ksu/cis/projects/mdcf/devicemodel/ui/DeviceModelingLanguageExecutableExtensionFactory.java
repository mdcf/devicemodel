/*
 * generated by Xtext
 */
package edu.ksu.cis.projects.mdcf.devicemodel.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import edu.ksu.cis.projects.mdcf.devicemodel.ui.internal.DeviceModelingLanguageActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DeviceModelingLanguageExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return DeviceModelingLanguageActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return DeviceModelingLanguageActivator.getInstance().getInjector(DeviceModelingLanguageActivator.EDU_KSU_CIS_PROJECTS_MDCF_DEVICEMODEL_DEVICEMODELINGLANGUAGE);
	}
	
}
