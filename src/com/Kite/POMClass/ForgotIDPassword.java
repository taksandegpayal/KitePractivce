package com.Kite.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ForgotIDPassword {
	
	private WebDriver driver;
	
	@FindBy(xpath="//a[@href='/forgot']")
	private WebElement forgotUserIDPassword;
	
	@FindBy(xpath="//label[@for='radio-31']")
	private WebElement rememberID;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement userID;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement panNo;
	
	@FindBy(xpath="//label[@for='radio-36']")
	private WebElement redioButtonEmail;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement emailID;
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement captcha;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement resetButton;
	
	public ForgotIDPassword(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickForgotUserIDPassword()
	{
		forgotUserIDPassword.click();
	}
	
	public void clickRememberID()
	{
		rememberID.isSelected();
	}

	public void sendUserID()
	{
		userID.sendKeys("BF6525");
	}
	
	public void sendPanNo()
	{
		panNo.sendKeys("AXGPT26L");
	}
	public void clickRedioButtonEmail()
	{
		redioButtonEmail.isSelected();
	}
	public void sendEmailID()
	{
		emailID.sendKeys("taksandegpayal@gmail.com");
	}

}
