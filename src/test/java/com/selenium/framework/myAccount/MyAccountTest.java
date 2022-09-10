package com.selenium.framework.myAccount;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.selenium.framework.base.BaseClass;
import com.selenium.framework.base.ExcelData;
import com.selenium.framework.home.HomeTest;
import com.selenium.framework.login.LoginTest;

public class MyAccountTest extends BaseClass
{
	HomeTest objHomeTest;
	LoginTest objLoginTest;
	MyAccountPage objMyAccountPage;
	
	String G_wishlist = ExcelData.getValue("MyAccount", 1, 2);
	
	@BeforeClass
	public void homeToMyAccount() throws InterruptedException
	{
		objHomeTest = new HomeTest();
		objHomeTest.clickOnSigninBTN();
		objLoginTest = new LoginTest();
		objLoginTest.doValidLogin();
	}
	
	@Test
	public void verifywishlistbtn()
	{
		objMyAccountPage = new MyAccountPage(driver);
		String Actual = objMyAccountPage.verifyContent();
		Assert.assertEquals(Actual, G_wishlist);
	}
}
