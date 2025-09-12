package practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alertswithoutswitchto {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
	  
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		
		Thread.sleep(2000);
		
		Alert myalert=mywait.until(ExpectedConditions.alertIsPresent());
		
		myalert.accept();
		
		String result=driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println(result);
		
	}

}
