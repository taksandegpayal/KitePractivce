package com.Kite.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TFAPage {
	private WebDriver driver;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement pin;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement countinueButton;
	
	@FindBy(xpath="//span[@class='user-id']")
	private WebElement userID;
	
	@FindBy(xpath="//h4[@class='username']")
	private WebElement profileName;
	
	
	public TFAPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void sendPin()
	{
		pin.sendKeys("050793");
	}
	public void countinueButton()
	{
		countinueButton.click();
	}
	public void  clickprofileName()
	{
		 userID.click();
	}
	public String checkProfileName()
	{
		String s = profileName.getText();
		return s;
	}
	
}