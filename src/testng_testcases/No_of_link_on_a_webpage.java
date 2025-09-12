package testng_testcases;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class No_of_link_on_a_webpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		 Set<Cookie> cookiesList =  driver.manage().getCookies();
	        for(Cookie getcookies :cookiesList) {
	            System.out.println(getcookies);
	        }
		
		List<WebElement> a=driver.findElements(By.tagName("a"));
		
		int sizea=a.size();
		System.out.println(sizea);
		for(int i=1;i<sizea;i++)
		{
			WebElement b=a.get(i);
			String c=b.getText();
			System.out.println(c);
		}
		
		driver.quit();
		

	}

}
