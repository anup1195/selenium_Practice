package practice;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class screeshot {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		
		//Screenshot for full page
//		
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		
//		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
//		
//		File Target=new File("D:\\Codes\\Eclips\\Selenium_TestNG"+"\\Screenshot\\fullpage.png");
//		
//		sourcefile.renameTo(Target);
		
		//Screenshot for specific area
		
		WebElement features=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		
		File sourcefile=features.getScreenshotAs(OutputType.FILE);
		
		File Target=new File("D:\\Codes\\Eclips\\Selenium_TestNG"+"\\Screenshot\\features.png");
		
		sourcefile.renameTo(Target);
		
		
		
	}

}
