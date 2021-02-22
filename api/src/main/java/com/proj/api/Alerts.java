package com.proj.api;

import java.util.List;

public class Alerts {
	
	
	private List<alert> alerts;
	private static Alerts instance;
	
	public static Alerts getInstance(){
		if(instance==null)
			instance = new Alerts();
		
		return instance;
	}
	
	public List<alert> getAll(){
		return alerts;
	}
	
	boolean addAlert(alert obj) {
		return alerts.add(obj);
	}
	
	
	alert getalert(String id) {
	for(alert alertobj: alerts) {
		if(alertobj.getId().equals(id)==true)
				return alertobj;
	}		
		return null;
	}
}
