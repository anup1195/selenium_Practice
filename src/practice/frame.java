package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		WebElement frame1=driver.findElement(By.xpath("/html[1]/frameset[1]/frame[1]"));
		
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Anup");
		
		driver.switchTo().defaultContent();
		
		WebElement frame2=driver.findElement(By.xpath("//frameset//frameset//frame[1]"));
		
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Anup");
		
		driver.switchTo().defaultContent();
		
		WebElement frame3=driver.findElement(By.xpath("//frameset//frameset//frame[2]"));
		
		driver.switchTo().frame(frame3);
		
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Anup");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[2]")).click();
		
		driver.switchTo().defaultContent();
		
		WebElement frame4=driver.findElement(By.xpath("//frameset//frame[3]"));
		
		driver.switchTo().frame(frame4);
		
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Anup");
		
		

	}

}
