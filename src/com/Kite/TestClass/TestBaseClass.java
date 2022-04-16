package com.Kite.TestClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.Kite.POMClass.LoginPage;
import com.Kite.POMClass.Logout;
import com.Kite.POMClass.TFAPage;
import com.Kite.POMClass.UtilityClass;

public class TestBaseClass {
	WebDriver driver;
	
	@Parameters("browserName")
	@BeforeMethod
	
	public void setUpMethod(String browserName) throws InterruptedException, IOException
	{
			if (browserName.equals("chrome"))
			{
			System.setProperty("webdriver.chrome.driver", "E:\\Automation Tools\\chromedriver_win32\\chromedriver.exe");
			System.out.println("1.Properties are set for Web browser");
			
			driver = new ChromeDriver();
			System.out.println("2.Browser is opened");
			}
			else if(browserName.equals("firefox"))
			{
			System.setProperty("webdriver.gecko.driver", "E:\\Automation Tools\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			System.out.println("1.Properties are set for Web browser");
				
			driver = new FirefoxDriver();
			}
			
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
			
			lp.sendPin();
			System.out.println("8.PIN send");
			
			lp.countinueButton();
			System.out.println("9.Clikced on countinue button");
		}
	
	@AfterMethod
	public void tearDownMethod() 
	{
		Logout lg = new Logout(driver);
		lg.clickMenu();
		
		
		lg.clickLogout();
		
	}
}
