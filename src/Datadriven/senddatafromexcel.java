package Datadriven;

import java.time.Duration;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class senddatafromexcel extends ExcelUtils {

	public static void main(String[] args) throws InvalidFormatException {


		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(ExcelUtils.readData("Sheet1",0,0));
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(ExcelUtils.readData("Sheet1",1,0));
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();

	}

}
