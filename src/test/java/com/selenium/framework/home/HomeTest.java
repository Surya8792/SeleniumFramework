package com.selenium.framework.home;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.selenium.framework.base.BaseClass;
import com.selenium.framework.homepage.HomePage;
import com.selenium.framework.login.LoginTest;

public class HomeTest extends BaseClass
{
	// creating global or class instances
	HomePage G_objHomePage;
	
	@Test
	public void verifyTitleandURL() throws InterruptedException
	{
		G_objHomePage = new HomePage(driver);		
		String actualURL = G_objHomePage.getURL();
		Assert.assertEquals(actualURL, "http://automationpractice.com/index.php");	
		
		String actualTitle = G_objHomePage.getTitle();				
		Assert.assertEquals(actualTitle, "My Store");
	}
	
	@Test
	public void clickOnSigninBTN() throws InterruptedException
	{
		G_objHomePage = new HomePage(driver);
		G_objHomePage.clickonsignBTN();
		Thread.sleep(4000);
	}

}
