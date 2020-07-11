package com.nava.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SighInPage {
	public WebDriver driver;

	public SighInPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	@FindBy(id ="username") WebElement username;
	@FindBy(id ="password") WebElement password;
	@FindBy(className="_2tmy0") WebElement signInButton;
	
	public void enterCreadentials(String username,String password) {
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		signInButton.click();
	}
				
	}

