package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args)  {
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
          driver.findElement(By.linkText("Create Lead")).click();
          driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TextComp1");
          driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Test91");
          driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Test91");
          driver.findElement(By.xpath("//input[@id='createLeadForm_generalProfTitle']")).sendKeys("Test991");
          driver.findElement(By.name("submitButton")).click();
          
         
          
         String title = driver.findElement(By.xpath("//span[@id='viewLead_generalProfTitle_sp']")).getText();
    
         if(title.equals("Test991"))
         {
        	 System.out.println("The Tile displayed correctly  and the Value is :" + title);
         }
         else
         {
        	 System.out.println("The Tile displayed is not correct  and the Value is :" + title);

         }

          
         driver.close();
          
	}

}
