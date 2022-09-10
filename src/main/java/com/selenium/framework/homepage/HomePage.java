package com.selenium.framework.homepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.framework.base.BaseClass;

public class HomePage extends BaseClass
{
	//locators
	@FindBy(xpath = "//a[contains(text(),'Sign in')]")
	private WebElement G_signBTN;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a/span")
	private WebElement G_leave;
	
	//creating constructor
	public HomePage(WebDriver p_driver)
	{
		PageFactory.initElements(p_driver, this);
	}
	
	public void clickonsignBTN()
	{
		G_signBTN.click();
	}
	
	public String getTitle()
	{
		String actualTitle = driver.getTitle();
		return actualTitle;
	}
	public String getURL()
	{
		String actualURL = driver.getCurrentUrl();
		return actualURL;
	}
}
