package com.Kite.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	WebDriver driver;
	@FindBy(xpath="//div[@class='user-nav perspective']")
	private WebElement menu;
	
	@FindBy(xpath="//a[@target='_self']")
	private WebElement logout;
	
	public Logout(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickMenu()
	{
		menu.click();
	}
	
	public void clickLogout()
	{
		logout.click();
	}

}
