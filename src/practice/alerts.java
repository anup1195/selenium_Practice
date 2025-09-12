package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		String result=driver.findElement(By.xpath("//p[@id='result']")).getText();
		
		
		System.out.println(result);
		
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
        String result1=driver.findElement(By.xpath("//p[@id='result']")).getText();
		
		System.out.println(result1);
		
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		
        String result2=driver.findElement(By.xpath("//p[@id='result']")).getText();
		
		System.out.println(result2);
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().sendKeys("anup");
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
        String result3=driver.findElement(By.xpath("//p[@id='result']")).getText();
		
		System.out.println(result3);
		
		
		
		
		
	}

}
