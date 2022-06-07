package com.automationlearn.java;

import java.io.FileInputStream;
import java.util.Properties;

public class Rediff_Properties_Concept {

	public static void main(String[] args) throws Exception {
		Properties prop = new Properties();
		String path = System.getProperty("user.dir") + "\\src\\main\\java\\com\\automationlearn\\java\\config_properties";
		FileInputStream ip = new FileInputStream(path);
		prop.load(ip);
		
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("username"));
		


	}

}
