package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		//switch to frame 
		driver.switchTo().frame(frame);
		
		//method 1 by using sendkeys
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("08/07/2025");
		
		//2nd method by using datepicker
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		String year="2026";
		String month="July";
		String date="20";
		
		while(true)
			
		{
			String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			
			String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(currentmonth.equals(month) && currentyear.equals(year))
			{
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
			//driver.findElement(By.xpath("(//a[normalize-space()='20'])[1]")).click();
		
			List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
			for(WebElement dt:alldates)
			{
				if(dt.getText().equals(date))
				{
					dt.click();
					break;
				}
			}
	}

}
