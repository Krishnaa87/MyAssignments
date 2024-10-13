package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

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
          driver.findElement(By.linkText("Create Account")).click();
          
          driver.findElement(By.xpath("//div[@class='x-panel-header x-unselectable']")).click();
          
          driver.findElement(By.id("accountName")).sendKeys("CreateAccount16");
          
          WebElement ele1 = driver.findElement(By.name("industryEnumId"));
          Select lst1 = new Select(ele1);
          
          
          lst1.selectByVisibleText("Computer Software");
          
          WebElement ele2 = driver.findElement(By.name("ownershipEnumId"));
          
          lst1 = new Select(ele2);
          
          lst1.selectByVisibleText("S-Corporation");
          
       WebElement ele3 = driver.findElement(By.name("dataSourceId"));
          
          lst1 = new Select(ele3);
          
          lst1.selectByValue("LEAD_EMPLOYEE");


          driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
 WebElement ele4 = driver.findElement(By.name("marketingCampaignId"));
          
          lst1 = new Select(ele4);
          
          lst1.selectByIndex(5);
          
    WebElement ele5 = driver.findElement(By.id("generalStateProvinceGeoId"));
    
    lst1 = new Select(ele5);
    
    lst1.selectByValue("TX");
    
    
    driver.findElement(By.className("smallSubmit")).click();
    
    
 String accName = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
    	boolean nm =	accName.contains("CreateAccount16");

    	if (nm == true)
    	{
 	System.out.println("The AccountName is Correct :"+ accName);
    	
    	}
    	else
    	{
    	 	System.out.println("The AccountName is InCorrect :"+ accName);
    		
    	}
//    	
//  
//    	
    	
//          driver.findElement(By.linkText("Leads")).click();
//          driver.findElement(By.linkText("Create Lead")).click();
//          driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TextComp1");
//          driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Test91");
//          driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Test91");
//          driver.findElement(By.xpath("//input[@id='createLeadForm_generalProfTitle']")).sendKeys("Test991");
//          driver.findElement(By.name("submitButton")).click();
//          
//         
//          
//         String title = driver.findElement(By.xpath("//span[@id='viewLead_generalProfTitle_sp']")).getText();
//    
//         if(title.equals("Test991"))
//         {
//        	 System.out.println("The Tile displayed correctly  and the Value is :" + title);
//         }
//         else
//         {
//        	 System.out.println("The Tile displayed is not correct  and the Value is :" + title);
//
//         }
//
//          
driver.close();
          
	}

}
