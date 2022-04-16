package com.Kite.TestClass;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Kite.POMClass.BuyShare;
import com.Kite.POMClass.UtilityClass;

public class TC_05_BuyShareFunctionality extends TestBaseClass {
	
	@Test
	
	public void validateBuyFunctionality() throws InterruptedException, IOException
	{
		BuyShare bs = new BuyShare(driver);
		bs.selectMarketWatch();
		bs.selectSearch();
		bs.selectTCS();
		Thread.sleep(2000);
		bs.buyTCS();
		bs.selectNSE();
		bs.selectQuantity();
		bs.selectIntradDay();
		bs.selectMarketPrice();
		UtilityClass.TakesScreenShot(driver);
		bs.buyShare();
		
	}

}
