package testng_testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Testcase1 extends lunchquit {
	
	@Test(retryAnalyzer=Listners.mylistners.class)
	
	public void login_to_amazon() throws InterruptedException
	{
	
		
		driver.findElement(By.id("search")).sendKeys("201301" + Keys.ENTER);
		
		driver.findElement(By.id("searchtext11")).sendKeys("tiles" + Keys.ENTER);	
	}
	

	

}
