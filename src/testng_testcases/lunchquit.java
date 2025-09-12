package testng_testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class lunchquit {

	WebDriver driver;
	
	@BeforeMethod
	@Parameters("browsers")

	public void launch(String nameofbrowser)
	
	{
		if(nameofbrowser.equals("chrome"))
		{

		 driver= new ChromeDriver();
		}
		if(nameofbrowser.equals("firefox"))
		{

		 driver= new FirefoxDriver();
		}
		driver.get("https://www.easybuild.com/en/");
		
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
	
	}


