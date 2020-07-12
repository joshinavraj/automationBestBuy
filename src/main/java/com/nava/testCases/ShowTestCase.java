package com.nava.testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.nava.pages.BaseClass;
import com.nava.pages.HomePage;
import com.nava.pages.SighInPage;

public class ShowTestCase extends BaseClass {
	@Test
	public void myTest() {
		System.out.println("Shree Ganishaia Naama");
		HomePage homePage=PageFactory.initElements(driver, HomePage.class);
		homePage.clickAccountMenuIcon();
		SighInPage sighInPage=PageFactory.initElements(driver, SighInPage.class);
		sighInPage.enterCreadentials("navraj@joshi.com", "Navraj@joshi");
		System.out.println("Test casse passed");
		
	}

}
