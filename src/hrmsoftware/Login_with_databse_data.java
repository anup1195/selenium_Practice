package hrmsoftware;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_with_databse_data  {

	public static void main(String[] args) throws Exception{
		
		jdbcconnection.logindata();
		
		String email=jdbcconnection.email;
		String Password=jdbcconnection.password;
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(Password);

		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
		
		driver.close();
		
		
	}

}
