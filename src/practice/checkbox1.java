package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		//for(int i=0;i<4;i++)//first 4
			//for(int i=4;i<checkbox.size();i++)
			for(int i=2;i<5;i++) // any middle
		{
			checkbox.get(i).click();
			
		}
			
			Thread.sleep(10000);
//			for(int j=2;j<5;j++) // any middle
//			{
//				checkbox.get(j).click();
//				
//			}
			
			for(int i=0;i<checkbox.size();i++) // any middle
			{
				if(checkbox.get(i).isSelected())
					//if(!checkbox.get(i).isSelected()) //if not selected
				{
					checkbox.get(i).click();
				}
				
			}



	}

}
