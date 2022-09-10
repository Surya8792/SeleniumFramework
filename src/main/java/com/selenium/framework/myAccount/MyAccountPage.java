package com.selenium.framework.myAccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.framework.base.BaseClass;

public class MyAccountPage extends BaseClass
{
	@FindBy(xpath = "//*[@id=\"center_column\"]/div/div[2]/ul/li/a/span")
	private WebElement wishlist;
	
	public MyAccountPage(WebDriver p_driver)
	{
		PageFactory.initElements(p_driver, this);
	}
	
	public String verifyContent()
	{
		return wishlist.getText();
	}
	
}
