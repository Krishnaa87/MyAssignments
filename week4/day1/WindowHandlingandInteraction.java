package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingandInteraction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
        
	    
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("http://leaftaps.com/opentaps/.");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        
        driver.findElement(By.linkText("Contacts")).click();
//Merge Contacts
        
        driver.findElement(By.linkText("Merge Contacts")).click();

        
        driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[1]")).click();
       Set<String> wins = driver.getWindowHandles();
       
       List <String> lstwins = new ArrayList<>(wins);
       
       driver.switchTo().window(lstwins.get(1));
        
        //driver.manage().window().maximize();
      driver.findElement(By.xpath("(//table[@class='x-grid3-row-table'])[1]/tbody/tr[1]/td[1]/div/a")).click();
      

      Thread.sleep(5000);
      driver.switchTo().window(lstwins.get(0));
  
      driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
      Set<String> wins2 = driver.getWindowHandles();
      
      List <String> lstwins2 = new ArrayList<>(wins2);
      
     
      Thread.sleep(5000);
      driver.switchTo().window(lstwins2.get(1));
      driver.findElement(By.xpath("(//table[@class='x-grid3-row-table'])[2]/tbody/tr[1]/td[1]/div/a")).click();
      driver.switchTo().window(lstwins2.get(0));

      driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
      
      driver.switchTo().alert().accept();
      
      Thread.sleep(5000);

      String title = driver.getTitle();
      
      if (title.equalsIgnoreCase("View Contact | opentaps CRM"))
      {
    	  System.out.println("Title is Correct :" + title);
      }

      else
      {

    	  System.out.println("Title is InCorrect :" + title);
      }
      
      
}
	
	
}
