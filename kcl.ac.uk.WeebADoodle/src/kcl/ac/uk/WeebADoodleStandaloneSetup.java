/*
 * generated by Xtext 2.29.0
 */
package kcl.ac.uk;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class WeebADoodleStandaloneSetup extends WeebADoodleStandaloneSetupGenerated {

	public static void doSetup() {
		new WeebADoodleStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
