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
	public alerttype getAlerttype() {
		return alerttype;
	}
	public void setAlerttype(alerttype alerttype) {
		this.alerttype = alerttype;
	}
	public String getAlertdescrption() {
		return alertdescrption;
	}
	public void setAlertdescrption(String alertdescrption) {
		this.alertdescrption = alertdescrption;
	}
	private alerttype alerttype;
	private String alertdescrption;
	private String id;
}
