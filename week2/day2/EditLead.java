package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) 
	
	
	{
	ChromeDriver driver = new ChromeDriver();
    
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get("http://leaftaps.com/opentaps/.");
    driver.manage().window().maximize();
    
    driver.findElement(By.id("username")).sendKeys("demosalesmanager");
    driver.findElement(By.id("password")).sendKeys("crmsfa");
    driver.findElement(By.className("decorativeSubmit")).click();
    driver.findElement(By.linkText("CRM/SFA")).click();
    driver.findElement(By.linkText("Leads")).click();
    driver.findElement(By.linkText("Create Lead")).click();
    driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TextComp5");
    driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Test95");
    driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Test95");
    driver.findElement(By.name("firstNameLocal")).sendKeys("Test95");
    
    //departmentName)
    driver.findElement(By.name("departmentName")).sendKeys("Test95");
    
    driver.findElement(By.id("createLeadForm_description")).sendKeys("Test95");
    
    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Test95@gmail.com");
    
    WebElement el1 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
    
    Select opt1  = new Select(el1);
    opt1.selectByVisibleText("Florida");
    
    
    
    
    
    
   // driver.findElement(By.xpath("//input[@id='createLeadForm_generalProfTitle']")).sendKeys("Test992");
    driver.findElement(By.name("submitButton")).click();
    driver.findElement(By.linkText("Edit")).click();
    driver.findElement(By.id("updateLeadForm_description")).clear();
    driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Test95");
    driver.findElement(By.className("smallSubmit")).click();
    
    
    System.out.println(driver.getTitle());
    
   driver.close();
    
//   String title = driver.findElement(By.xpath("//span[@id='viewLead_generalProfTitle_sp']")).getText();
//
//   if(title.equals("Test992"))
//   {
//  	 System.out.println("The Tile displayed correctly  and the Value is :" + title);
//   }
//   else
//   {
//  	 System.out.println("The Tile displayed is not correct  and the Value is :" + title);
//
//   }

    
   //driver.close();
    
}
}
