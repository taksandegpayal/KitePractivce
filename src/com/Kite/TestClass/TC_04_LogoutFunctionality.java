package com.Kite.TestClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Kite.POMClass.LoginPage;
import com.Kite.POMClass.Logout;
import com.Kite.POMClass.TFAPage;
import com.Kite.POMClass.UtilityClass;

public class TC_04_LogoutFunctionality {
	WebDriver driver;
	
@BeforeMethod
	
	public void setUpMethod() throws InterruptedException, IOException
	{
			System.setProperty("webdriver.chrome.driver", "E:\\Automation Tools\\chromedriver_win32\\chromedriver.exe");
			System.out.println("1.Properties are set for Web browser");
			
			driver = new ChromeDriver();
			System.out.println("2.Browser is opened");
			
			driver.manage().window().maximize();
			System.out.println("3.Browser is Maximized");
			
			driver.get("https://kite.zerodha.com");
			System.out.println("4.Zerodha-kite URL is opened");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			LoginPage lp=new LoginPage(driver);
			lp.sendUsername();
			System.out.println("5.Username send");
			
			lp.sendPassword();
			System.out.println("6.Password send");
			Thread.sleep(1000);
			UtilityClass.TakesScreenShot(driver);
			
		 	lp.LoginButton();
		 	Thread.sleep(4000);
			System.out.println("7.login button clicked");
			
			TFAPage tf = new TFAPage(driver);
			Thread.sleep(5000);
			
			tf.sendPin();
			System.out.println("8.PIN send");
			
			tf.countinueButton();
			Thread.sleep(4000);
			System.out.println("9.Clikced on countinue button");
		}
	
	@Test
	public void validateLogoutFunctionality() throws IOException
	{
	Logout lg = new Logout(driver);
	lg.clickMenu();
	
	
	lg.clickLogout();
	UtilityClass.TakesScreenShot(driver);
	
//	String expectedTitle = "Kite - Zerodha's fast and elegant flagship trading platform";
//	String ActualTitle = driver.getTitle();
//	System.out.println(ActualTitle);
	
	
	}
}

