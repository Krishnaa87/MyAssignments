package week4.day1;



import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandles {

	public static void main(String[] args) {
		ChromeOptions obj = new ChromeOptions();
		obj.addArguments("--disable-notifications");
		
		
		ChromeDriver driver = new ChromeDriver(obj);
		driver.manage().window().maximize();
		
		
		driver.get("https://www.irctc.co.in/");
		

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("FLIGHTS")).click();
		
		
		System.out.println(driver.getTitle());

	//Thread.sleep(5000);
	
		Set<String>allWindows1  =	driver.getWindowHandles();
		
		List<String>allWindows2 = new ArrayList<>(allWindows1);
		
		
		driver.switchTo().window(allWindows2.get(0));
		
		
		driver.close();
		
		
	
	
	

	}

}
