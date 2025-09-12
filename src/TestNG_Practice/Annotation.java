package TestNG_Practice;

import java.time.Duration;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Datadriven.ExcelUtils;

public class Annotation {
	
	
	
WebDriver driver=new ChromeDriver();
	@BeforeClass
	void openbrowser() {
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		System.out.println("first open the browser");
	}

	@Test(priority=2)
	void hiturl() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/");

		System.out.println("Hit url");
	}

	@Test(priority=3)
	void login() throws InvalidFormatException {
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(ExcelUtils.readData("Sheet1",0,0));
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(ExcelUtils.readData("Sheet1",1,0));
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

		System.out.println("login");
	}

	@Test(priority=4)
	void homepage() {
		
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();

		System.out.println("land on homepage");
	}
	
	@AfterClass
	void close()
	{
		driver.close();
	}
	
}
