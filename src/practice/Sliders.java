package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliders {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/resources/demos/slider/range.html");
		
		Actions act=new Actions(driver);
		
		WebElement minvalue=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));

		System.out.println("Min location is " + minvalue.getLocation());
		
		act.dragAndDropBy(minvalue,-180,46).perform();
		
		System.out.println("Min location is " + minvalue.getLocation());
		
		WebElement maxvalue=driver.findElement(By.xpath("//span[2]"));
		
		System.out.println("max location is " + maxvalue.getLocation());
		
		act.dragAndDropBy(maxvalue, -700, 46).perform();
		
	
		

	}

}
