/*
* generated by Xtext
*/
package org.cradle.language;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class CradleUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.cradle.language.ui.internal.CradleActivator.getInstance().getInjector("org.cradle.language.Cradle");
	}
	
}
