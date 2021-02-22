package com.proj.api;

import java.io.Serializable;

public class alert {
	
//	alert (String id, alerttype alerttype, String alertdescription){
//		this.id= id;
//		this.alerttype = alerttype;
//		this.alertdescrption = alertdescription;
//	}
//	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public alerttype getAlrettype() {
		return alerttype;
	}
	public void setAlrettype(alerttype alrettype) {
		this.alerttype = alrettype;
	}
	public String getAlertdescrption() {
		return alertdescrption;
	}
	public void setAlertdescrption(String alertdescrption) {
		this.alertdescrption = alertdescrption;
	}
	private String id;
	private alerttype alerttype;
	private String alertdescrption;
}
