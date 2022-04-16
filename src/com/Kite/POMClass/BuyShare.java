package com.Kite.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BuyShare {
	private WebDriver driver;
	
	@FindBy(xpath="//a[@class='router-link-exact-active router-link-active']")
	private WebElement marketWatch;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement searchShare;
	
	@FindBy(xpath="//li[@class='search-result-item selected isadded']")
	private WebElement TCS;
	
	@FindBy(xpath="(//button[@type='button'])[1]")
	private WebElement Buy;
	
	@FindBy(xpath="(//label[@class='su-radio-label'])[1]")
	private WebElement BSE;
	
	@FindBy(xpath="(//label[@class='su-radio-label'])[7]")
	private WebElement intraday;
	
	@FindBy(xpath="(//input[@type='number'])[1]")
	private WebElement quantity;
	
	@FindBy(xpath="(//label[@class='su-radio-label'])[9]")
	private WebElement marketPrice;
	
	@FindBy(xpath="(//span[text()='Buy'])[2]")
	private WebElement BuyShare;
	
	public BuyShare(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void selectMarketWatch() 
	{
		marketWatch.click();
	}
	public void selectSearch()
	{
		searchShare.sendKeys("TCS");
	}
	public void selectTCS()
	{
		TCS.click();
		Actions act=new Actions(driver);
		act.click(TCS).perform();
	}
	public void buyTCS()
	{
		Buy.click();
	}
	public void selectNSE()
	{
		BSE.isSelected();
		BSE.click();
	}
	public void selectIntradDay()
	{
		intraday.isSelected();
		intraday.click();
	}
	
	public void selectQuantity()
	{
		quantity.sendKeys("3");
	}
	public void selectMarketPrice()
	{
		marketPrice.isSelected();
		marketPrice.click();
	}
	public void buyShare()
	{
		BuyShare.click();
	}

}
