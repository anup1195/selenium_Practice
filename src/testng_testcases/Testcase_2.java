package testng_testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;



public class Testcase_2 extends lunchquit {

 
		
		@Test(retryAnalyzer=Listners.mylistners.class)
		
		public void seraching_on_amazon() throws InterruptedException
		
		{
		
			Thread.sleep(10);
			
			driver.findElement(By.id("search")).sendKeys("201301" + Keys.ENTER);
			
			driver.findElement(By.id("searchtext")).sendKeys("cement" + Keys.ENTER);
			
		}

	}

