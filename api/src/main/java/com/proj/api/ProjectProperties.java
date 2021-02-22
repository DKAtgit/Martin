package com.proj.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.camel.component.properties.PropertiesLookup;

public class ProjectProperties {
	
	private Properties properties;
	private static  ProjectProperties instance =null;
	
	public static ProjectProperties getInstance() throws IOException
	{
		if(instance ==null)
		instance=  new ProjectProperties();
		
		return instance;
	};
	
	ProjectProperties() throws IOException{
		ClassLoader clsloader = getClass().getClassLoader();
		
		File configFile = new File(clsloader.getResource("conf.properties").getFile());
		try {
			FileReader reader = new FileReader(configFile);
			
			properties= new Properties();
			properties.load(reader);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	Properties getPropertyList(){
		return properties; 
	}
	
	String getProperty(String property) {
		return this.properties.getProperty(property);
	}

}
