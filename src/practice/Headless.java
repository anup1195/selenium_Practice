package practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless {

	public static void main(String[] args) {

		ChromeOptions option=new ChromeOptions();
		
		option.addArguments("--headless");
		
		WebDriver driver=new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com");
		
		System.out.println(driver.getTitle());

	}

}
