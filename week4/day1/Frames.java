package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
		
		driver.manage().window().maximize();
		
		//driver.switchTo().frame(2);
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		driver.switchTo().alert().accept();
		
String txt1 =  driver.findElement(By.id("demo")).getText();

if (txt1.equalsIgnoreCase("You pressed OK!"))
	
{
	
	System.out.println("Action performed properly");
}

else
{
	System.out.println("Invalid Action ");

}


driver.close();
	}

}
