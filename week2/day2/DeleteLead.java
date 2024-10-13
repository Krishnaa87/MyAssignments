package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
        
	    
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("http://leaftaps.com/opentaps/.");
        driver.manage().window().maximize();
        
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Find Leads")).click();
        
        driver.findElement(By.xpath("//span[text()='Phone']")).click();
//driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("");
//driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("");
driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("1234");

driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

String ldid1 = driver.findElement(By.xpath("//a[@class='linktext']")).getText();

System.out.println(ldid1);

driver.findElement(By.xpath("//a[@class='linktext']")).click();

driver.findElement(By.xpath("//a[text()='Delete']")).click();


driver.findElement(By.xpath("//button[text()='Find Leads']")).click();


driver.findElement(By.xpath("//input[@class=' x-form-text x-form-field ']")).sendKeys(ldid1);
driver.findElement(By.xpath("//button[text()='Find Leads']")).click();


String ele1 = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
if (ele1.equalsIgnoreCase("No records to display"))
	
{
	System.out.println("No records to display");
}

else
{
	System.out.println(" records display");

}

driver.close();
}
	
}
