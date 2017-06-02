package com.trans.eclipseJavaRefresher;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.refresh.IRefreshMonitor;
import org.eclipse.core.resources.refresh.IRefreshResult;
import org.eclipse.core.resources.refresh.RefreshProvider;

public class JavaRefreshProvider  extends RefreshProvider {
	private JavaRefreshMonitor refreshMonitor;
	
	@Override
	public IRefreshMonitor installMonitor(IResource resource, IRefreshResult result) {
		try {
			if(refreshMonitor == null) {
				refreshMonitor = new JavaRefreshMonitor();
			}
			
			refreshMonitor.monitor(resource, result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return refreshMonitor;
	}
}
