package com.proj.api;

import org.apache.camel.Message;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.camel.model.rest.RestParamType;

/*
 * Alert Engine API
 * 
 * 
 * */
public class AlertEngineAPI extends RouteBuilder  {
	
	 alertService service = new alertService();
	
	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		
		
		restConfiguration().component("netty-http").host("0.0.0.0").port(ProjectProperties.getInstance().getProperty("server.port"))
		.bindingMode(RestBindingMode.auto);
		
		rest("/url1").get().id("test_route1").to("log:dummylog");
		rest("/alert").description("alerts description")
		
        .get("/").description("List of all alerts")
        .route().routeId("alerts-api")
        .bean(alertService.class, "getAll")
        .endRest()
        
		
        .get("alert/{id}").description("Specific Alert")
        .route().routeId("alert-get-api")
        .bean(alertService.class, "findalert(${header.id})")
		.endRest()
		
		.post("/add")
        .consumes("application/json").type(alert.class)
        .route().bean(service, "addAlert(${body})").endRest();
		
		
		
	}
	

	
}
