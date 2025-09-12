package practice;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AddExtension {

	public static void main(String[] args) {
		
		ChromeOptions option=new ChromeOptions();
		
		//File file=new File("D:\\Codes\\Eclips\\Selenium_TestNG\\crx\\Selectorshub.crx");
		
		//System.out.println(file.exists() ? "Extension found!" : "Extension not found!");

		//option.addArguments("load-extension=D:\\Codes\\Eclips\\Selenium_TestNG\\crx\\Selectorshub.crx");

		option.addExtensions(new File("D:\\\\Codes\\\\Eclips\\\\Selenium_TestNG\\\\crx\\\\Selectorshub.crx"));
		
		WebDriver driver=new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		try {
		    boolean isPresent = driver.getPageSource().contains("Selectorshub");
		    System.out.println("Extension active? " + isPresent);
		} catch (Exception e) {
		    System.out.println("Extension not detected!");
		}
	}

}
