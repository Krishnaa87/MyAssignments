package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class promptAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
		
	driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
	
		Alert text = driver.switchTo().alert();
		
		text.sendKeys("Test1");
		text.accept();
		
		String res = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(res);
		
		driver.close();
		

	}

}
