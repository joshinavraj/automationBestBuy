package com.nava.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
 
import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.nava.util.BrowserFactory;


// This is Base class of all classes, We have to use it while running other classes and it contain all common Referances and Methods
public class BaseClass {

	public WebDriver driver;

	public static Properties prop;
	// setup page is goes there

	public BaseClass() {

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"./Config/conf.properties");
			try {
				prop.load(ip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@BeforeClass
	public void setup() {
		System.out.println("Calles setup method Before Test");
		driver = BrowserFactory.startApplication(driver, prop.getProperty("browser"), prop.getProperty("URL"));
		System.out.println("chrome Browser lunched");
	}

	// tear down code goes here
	// @AfterClass
	public void teardown() {
		BrowserFactory.quitBrowser(driver);
		System.out.println("Called tear Down method");
	}

}
