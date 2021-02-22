package com.proj.api;

import org.apache.camel.Body;

public class alertService {
	 public Iterable < alert > getAll() {
	       return Alerts.getInstance().getAll();
	    }
	 
	 public alert findalert(String id) {
		 return Alerts.getInstance().getalert(id);
	 }
	 
	 public boolean addAlert(@Body alert obj) {
		 return Alerts.getInstance().addAlert(obj);
	 } 
	 
}
