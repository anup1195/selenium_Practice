package practice;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class checkbox {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Anup");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("anup@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("00000000");
		
		driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("noida");
		
		List<WebElement> radiobox=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='radio']"));
	
		for (WebElement radio : radiobox) {
		    String value = radio.getDomAttribute("value");  
		    if (value.equalsIgnoreCase("male")) {
		        radio.click();
		        break;
		    }
		}
		
	//	List<String> textList = new ArrayList<String>();
		
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		

		for(int i=0;i<checkbox.size();i++)
	   
		{
			String text=checkbox.get(i).getDomAttribute("value");
			System.out.println(text);
			
			if ("sunday".equalsIgnoreCase(text)) {
		        if (!checkbox.get(i).isSelected()) 
		        { 
		            checkbox.get(i).click();  
		        }
			
		   }
			
	  }
		
		WebElement allcountry=driver.findElement(By.xpath("//select[@id='country']"));
		Select countrylist=new Select(allcountry);
		 List<WebElement> allOptions = countrylist.getOptions();
		 for (WebElement option : allOptions) {
			 String countryname=option.getText();
			 if("Germany".equalsIgnoreCase(countryname))
			 {
				option.click();
			 }
			 
			    System.out.println("Option text: " + option.getText());
			   
			}

	}
	
}

