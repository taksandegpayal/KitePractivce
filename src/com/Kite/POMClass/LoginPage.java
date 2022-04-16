package com.Kite.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
private WebDriver driver;

@FindBy(xpath="//input[@id='userid']")
private WebElement userName;

@FindBy(xpath="//input[@id='password']")
private WebElement password;

@FindBy(xpath="//button[@type='submit']")
private WebElement loginButton;

@FindBy(xpath="//input[@type='password']")
WebElement pin;

@FindBy(xpath="//button[@type='submit']")
private WebElement countinueButton;

@FindBy(xpath="//span[@class='user-id']")
private WebElement userID;

@FindBy(xpath="//h4[@class='username']")
private WebElement profileName;

public LoginPage(WebDriver driver)
{
this.driver = driver;
PageFactory.initElements(driver, this);
}

public void sendUsername()
{
	userName.sendKeys("BF6525");
}
public void sendPassword()
{
    password.sendKeys("Payal@11");
}
public void LoginButton()
{
	loginButton.click();
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
