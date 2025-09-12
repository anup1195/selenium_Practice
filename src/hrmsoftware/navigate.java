package hrmsoftware;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//driver.navigate().to("https://www.practo.com/");
		
		driver.manage().window().maximize();
		
		//Thread.sleep(5000);
		
		//driver.navigate().refresh();
		
		//driver.navigate().back();
		
		//Thread.sleep(10000);
		
		//driver.navigate().forward();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
	
     	Set <String> windowsID=driver.getWindowHandles();
		
		//1st apprroch
//		
//		List<String> Windowslist=new ArrayList(windowsID);
//		
//		String parentid=Windowslist.get(0);
//		
//		String childid=Windowslist.get(1);
//		
//		driver.switchTo().window(childid);
//		
//		System.out.println(driver.getTitle());
//		
//		driver.findElement(By.xpath("//button[@class='nav-link ']")).click();
//		
//		driver.switchTo().window(parentid);
//		
//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		//second approche
		
		for(String windowsId:windowsID)
		{
			String ttile=driver.switchTo().window(windowsId).getCurrentUrl();
			
			System.out.println(ttile);
		}
		
		driver.close();
		
		
		
	}

}
