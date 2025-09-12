package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Datepicker2 {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		String reqyear="2033";
		String reqmonth="Dec";
		String reqdate="12";
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement Element=driver.findElement(By.xpath("//p[normalize-space()='Date Picker 1 (mm/dd/yyyy):']"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		
		driver.findElement(By.xpath("//input[@id='txtDate']")).click();
		
		WebElement yearsall=driver.findElement(By.xpath("//select[@aria-label='Select year']"));
		
		Select drop=new Select(yearsall);
		
		drop.selectByVisibleText(reqyear);
		
		WebElement monthall=driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		
		Select drop1=new Select(monthall);
		
		drop1.selectByVisibleText(reqmonth);
		
		List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement dt : alldates)
		{
			if(dt.getText().equals(reqdate))
			{
				dt.click();
				break;
			}
		}
		
		
		
		

	}

}
