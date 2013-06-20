package org.freeplane.core.ui.ribbon;

import java.util.Properties;

import org.freeplane.core.ui.IndexedTree;

public class RibbonSeparatorContributorFactory implements IRibbonContributorFactory {

	/***********************************************************************************
	 * CONSTRUCTORS
	 **********************************************************************************/

	/***********************************************************************************
	 * METHODS
	 **********************************************************************************/

	/***********************************************************************************
	 * REQUIRED METHODS FOR INTERFACES
	 **********************************************************************************/
	public IRibbonContributor getContributor(Properties attributes) {
		return new IRibbonContributor() {
			
			public String getKey() {
				return "separator_"+hashCode();
			}
			
			public void contribute(IndexedTree structure, IRibbonContributor parent) {
				parent.addChild(new RibbonSeparator(), null);
			}
			
			public void addChild(Object child, Object properties) {
			}
		};
	}
	
	public static class RibbonSeparator {
	}
}
