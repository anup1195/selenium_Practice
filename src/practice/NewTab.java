package practice;

import java.awt.Window;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewTab {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		
		Actions act=new Actions(driver);
		
		WebElement register=driver.findElement(By.xpath("//a[@class='ico-register']"));
		
		act.keyDown(Keys.CONTROL).click(register).keyUp(Keys.CONTROL).perform();
		
		Set<String> windowsId=driver.getWindowHandles();
		
		List<String> allwindows=new ArrayList(windowsId);
		
		String parentid=allwindows.get(0);
		
		String childid=allwindows.get(1);
		
		driver.switchTo().window(childid);
		
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Anup");

	}

}
