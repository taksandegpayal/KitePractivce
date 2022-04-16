package com.Kite.TestClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Kite.POMClass.ForgotIDPassword;

public class TC_03_ForgotIDPassFunctionality {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Tools\\chromedriver_win32\\chromedriver.exe");
		System.out.println("1.Properties are set for Web browser");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("2.Browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("3.Browser is Maximized");
		
		driver.get("https://kite.zerodha.com");
		System.out.println("4.Zerodha-kite URL is opened");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		ForgotIDPassword f = new ForgotIDPassword(driver);
		f.clickForgotUserIDPassword();
		f.clickRememberID();
		f.sendUserID();
		f.sendPanNo();
		f.clickRedioButtonEmail();
		f.sendEmailID();
		
		
	}

}
