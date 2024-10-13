package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButtonInteraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.get("https://leafground.com/button.xhtml");
		
		
		
		//System.out.println(driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).isEnabled());
		
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
		
	
		
		
		String title1 = driver.getTitle();
		
		if (title1.equalsIgnoreCase("Dashboard"))
		{
			System.out.println("The Title is Verified :"+ title1);
		}
		
		else
		{
			System.out.println("Incorrect Title :"+ title1);
		}
		
		driver.navigate().back();
		
		
		//Thread.sleep(Duration.ofSeconds(10));
	boolean isEnabled =	driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-state-disabled']")).isEnabled();
	
	if (isEnabled != true)
	{
		
		
		System.out.println("The Button is Disabled");
	}
	
	else
	{

		System.out.println("The Button is Not Disabled");
		
	}
	
	
	System.out.println(driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).getText());
	
	
	System.out.println(driver.findElement(By.xpath("(//div[@class='card']/h5)[1]")).getText());
	
System.out.println(driver.findElement(By.xpath("(//div[@class='card']/h5)[5]")).getText());
	
	driver.close();
	}
	
	
	
	

}
                                                                                                                                                                                                                                                                                                                                        