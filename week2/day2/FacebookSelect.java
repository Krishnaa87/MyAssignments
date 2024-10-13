	package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSelect {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("gopalakrishnan");
		driver.findElement(By.name("lastname")).sendKeys("jothisankar");
		WebElement dt = driver.findElement(By.name("birthday_day"));
		Select val1 = new Select(dt);
				val1.selectByValue("11");
				
				WebElement mon = driver.findElement(By.name("birthday_month"));
			 val1 = new Select(mon);
						val1.selectByVisibleText("Nov");
	WebElement yr = driver.findElement(By.name("birthday_year"));
			 val1 = new Select(yr);
			 val1.selectByValue("1987");		
			 
			driver.findElement(By.xpath("//span[@data-type='radio']/span[2]")).click();
			
			driver.findElement(By.name("reg_email__")).sendKeys("gopalakrishnanj999@gmail.com");
			driver.findElement(By.id("password_step_input")).sendKeys("Super@4321");
			driver.findElement(By.name("websubmit")).click();
		
	

	}

}
