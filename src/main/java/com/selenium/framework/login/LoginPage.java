package com.selenium.framework.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.framework.base.BaseClass;

public class LoginPage extends BaseClass
{
	@FindBy(xpath = "//input[@id='email']")
	private WebElement G_username;
	
	@FindBy(xpath = "//input[@id='passwd']")
	private WebElement G_password;
	
	@FindBy(xpath = "//button[@id='SubmitLogin']")
	private WebElement G_loginBTN;
	
	//creating constructor to initialize webelement
	public LoginPage(WebDriver P_driver)
	{
		PageFactory.initElements(P_driver, this);
	}
	
	public void doLogin(String p_username ,String p_password) throws InterruptedException
	{
		G_username.sendKeys(p_username);
		
		G_password.sendKeys(p_password);
		
		G_loginBTN.click();
	}
	
}
