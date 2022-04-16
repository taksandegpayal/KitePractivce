package com.Kite.TestClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Kite.POMClass.LoginPage;
import com.Kite.POMClass.TFAPage;
import com.Kite.POMClass.UtilityClass;

public class TC_01_LoginFunctionality {
	
WebDriver driver;
	
@Test
public void validateLoginFuncyionality() throws InterruptedException, IOException
{
	System.setProperty("webdriver.chrome.driver", "E:\\Automation Tools\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com");
	
	LoginPage lp=new LoginPage(driver);
	lp.sendUsername();
	lp.sendPassword();
	lp.LoginButton();
	Thread.sleep(5000);
	
	UtilityClass.TakesScreenShot(driver);
	
	String Expeceted2FVerificationURL = "https://kite.zerodha.com/";
	
	String ActualHomePageURL = driver.getCurrentUrl();
	System.out.println(ActualHomePageURL);
	
	Assert.assertEquals(ActualHomePageURL, Expeceted2FVerificationURL);
}
	
	@Test
	
	public void validateTFAFunctionality() throws InterruptedException
	{

	LoginPage lf=new LoginPage(driver);
	Thread.sleep(5000);
	
	lf.sendPin();
	System.out.println("8.PIN send");
	
	lf.countinueButton();
	System.out.println("9.Clikced on countinue button");
	
	Thread.sleep(5000);
	lf.clickprofileName();
	
	lf.checkProfileName();
	
	}	
	
}

