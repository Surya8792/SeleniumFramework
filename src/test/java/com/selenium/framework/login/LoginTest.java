package com.selenium.framework.login;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.selenium.framework.base.BaseClass;
import com.selenium.framework.base.ExcelData;
import com.selenium.framework.home.HomeTest;

public class LoginTest extends BaseClass
{
	LoginPage objLoginPage;
	HomeTest objHomeTest;
	
	// taking inputs values from excel
		String G_username = ExcelData.getValue("Login", 1, 2);
		String G_password = ExcelData.getValue("Login", 2, 2);
	
	@BeforeClass
	public void homepageToLoginPage() throws InterruptedException
	{
		objHomeTest = new HomeTest();
		objHomeTest.clickOnSigninBTN();
	}
	@Test
	public void doValidLogin() throws InterruptedException
	{
		objLoginPage = new LoginPage(driver);
		objLoginPage.doLogin(G_username, G_password);	

	}
}
