package practice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLinks {

	public static void main(String[] args) {
		
		ChromeOptions option=new ChromeOptions();
		
		option.addArguments("--headless");
		
		WebDriver driver=new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> lists=driver.findElements(By.tagName("a"));
		
		System.out.println("Total number of links are " + lists.size());
		
		int noofbrokenlinks=0;
		
		for(WebElement alllist:lists) 
		{
			
			@SuppressWarnings("deprecation")
			String hrefvalue=alllist.getAttribute("href");
			if(hrefvalue==null || hrefvalue.isEmpty() ) {
				System.out.println("the link is blank so we cant check");
			continue;
		}

		try
		{
		URL allurl= new URL(hrefvalue);
		HttpURLConnection conn=(HttpURLConnection) allurl.openConnection();
		conn.connect();
		if(conn.getResponseCode()>=400)
		{
			System.out.println(hrefvalue + " ==> this link is broken");
			noofbrokenlinks++;
		}
		else
		{
			System.out.println(hrefvalue + "  ==>  this is working fine");
		}
		}
		catch(Exception e)
		{
			
		}
	}
		System.out.println("no of broken links = " +  noofbrokenlinks);
		driver.quit();
	}
}
