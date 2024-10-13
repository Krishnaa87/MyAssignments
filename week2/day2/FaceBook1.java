package week2.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook1 {

	public static void main(String[] args) {
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://en-gb.facebook.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.findElement(By.linkText("Create new account")).click();
		  driver.findElement(By.name("firstname")).sendKeys("Krishna");
		  driver.findElement(By.name("lastname")).sendKeys("Sankar");
		  
//		 We
//		  Select val = new Select();
//		  driver.findElement(By.)
//		  
	}

}
