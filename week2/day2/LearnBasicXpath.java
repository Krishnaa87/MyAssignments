package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnBasicXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		


driver.get("https://www.facebook.com");
driver.manage().window().maximize();
//Thread.sleep(5000);

driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testleaf.2023@gmail.com");
driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Tuna@321");

driver.findElement(By.name("login")).click();
driver.findElement(By.linkText("Forgotten password?")).click();

driver.findElement(By.xpath("//input[@name='email']")).sendKeys("testleaf.2023@gmail.com");
	}

}
