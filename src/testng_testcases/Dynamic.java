package testng_testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.*;


	public class Dynamic {
		
	    public static void main(String[] args) throws InterruptedException {
	      
	    	ChromeDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.practo.com/");
			
			WebElement searchbox=driver.findElement(By.xpath("//input[@placeholder='Search location']"));
			
			searchbox.click();
			
			driver.findElement(By.xpath("//i[@class='icon-ic_cross_solid']")).click();
			
			Thread.sleep(2000);
			
			//searchbox.sendKeys(Keys.BACK_SPACE,"noida");
			
			driver.findElement(By.xpath("input[placeholder='Search location']")).sendKeys("Noida");
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//div[@class='c-omni-suggestion-item__content__title'][normalize-space()='Noida']")).click();
			
			driver.findElement(By.xpath("//input[@placeholder='Search doctors, clinics, hospitals, etc.']")).click();
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//*[@id=\"c-omni-container\"]/div/div[2]/div[2]/div[1]/div[1]/span[1]/div")).click();
			
			   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15)); // Adjust timeout as needed
	            wait.until((ExpectedCondition<Boolean>) wd ->
	            ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));

	            System.out.println("Page loaded successfully!");
			
     		JavascriptExecutor js=(JavascriptExecutor)driver;
//			WebElement Element=driver.findElement(By.xpath("//h2[normalize-space()='Dr. Aman Arora']"));
//			js.executeScript("arguments[0].scrollIntoView();", Element);
//			Element.click();
			//==============
			
			//==============
//	        Actions actions = new Actions(driver);
//			WebElement Element1=driver.findElement(By.xpath("//h2[normalize-space()='Dr. Rajat Sachdeva']"));
//			actions.scrollToElement(Element1).perform();
//			driver.quit();
	            
	            boolean found=false;
	            
	            while(!found)
	            {
	            	List<WebElement> Doctorsname=driver.findElements(By.xpath("//h2[@class='doctor-name']"));
	            	for(WebElement Doctorname:Doctorsname)
	            	{
	            		if(Doctorname.getText().equals("Dr. Rajat Sachdeva"))
	            		{
	            			System.out.println("Rajat is found");
	            			found=true;
	            			break;
	            		}
	            	}
	            	js.executeScript("window.scrollBy(0,300)", "");
	            	
	            }
	            driver.findElement(By.xpath("//h2[normalize-space()='Dr. Rajat Sachdeva']")).click();
	            
	            driver.close();


           }
	    }
