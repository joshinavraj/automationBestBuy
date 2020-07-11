package com.nava.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	public WebDriver driver;

	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	@FindBy(className ="signInOutNavContainer_1_MBd") WebElement accountMenuIcon;
	public void clickAccountMenuIcon() {
		accountMenuIcon.click();
	}

}
