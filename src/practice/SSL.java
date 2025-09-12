package practice;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SSL {

	public static void main(String[] args) {


		ChromeOptions option=new ChromeOptions();
		
		option.setAcceptInsecureCerts(true);
		
		ChromeDriver driver= new ChromeDriver(option);
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		driver.get("https://expired.badssl.com/");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());

	}

}
