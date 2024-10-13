package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractionswithCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
String msgExpected = "checked";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		
	
  String msgdisplayed = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
  
  if (msgdisplayed.equalsIgnoreCase(msgExpected))
	  
  {
	  System.out.println("msg displayed is correct :" +  msgdisplayed );
  }
  
  else
  {
	  System.out.println("msg displayed is Incorrect :" +  msgdisplayed);
  }
  
  
	driver.findElement(By.xpath("//label[text()='Java']")).click();
	driver.findElement(By.xpath("//label[text()='Python']")).click();
	driver.findElement(By.xpath("//label[text()='Javascript']")).click();
	driver.findElement(By.xpath("//label[text()='C-Sharp']")).click();
	driver.findElement(By.xpath("//label[text()='Others']")).click();



WebElement ele1 = driver.findElement(By.xpath("//div[contains(@id,'ajaxTriState')]/div[2]"));
ele1.click();

if (ele1.isSelected())
{
	System.out.println("Tri State Option is Choosen");
}

else
{
	System.out.println("Tri State is not Choosen");
}

driver.findElement(By.className("ui-toggleswitch-slider")).click();

String txt4 =  driver.findElement(By.className("ui-growl-title")).getText();


if (txt4.equalsIgnoreCase("checked"))
	
{
	System.out.println("Toggle button is clicked "+txt4);
}


else
{
	
	System.out.println("Toggle button is Not clicked");
}


WebElement el5 =driver.findElement(By.xpath("//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget']"));

el5.click();

if (el5.isSelected() != true)
{
	System.out.println("Is Diabled ");
	
}


else
{
	
	System.out.println("Is NOt Disabled");
}

Thread.sleep(12000);
driver.findElement(By.xpath("//ul[@class='ui-selectcheckboxmenu-multiple-container ui-widget ui-inputfield ui-state-default ui-corner-all']")).click();
driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[10]")).click();

driver.close();

//System.out.println(driver.findElement(By.xpath("//div[contains(@class,'ui-growl-icon-close')]")).isDisplayed());

//System.out.println(driver.findElement(By.xpath("//div[@class='ui-growl-message']/p")).isDisplayed());
//System.out.println(driver.findElement(By.xpath("//div[@class='ui-growl-message']/p")).isDisplayed());

//String txt1 = driver.findElement(By.xpath("//div[@class='ui-growl-message']/p")).getText();
//String txt1 = driver.findElement(By.xpath("//div[@class='ui-growl-message']/p")).getText();
//
////driver.findElement(By.xpath("//div[@class='ui-growl-message']/p")).isDisplayed();
//System.out.println(txt1);
//driver.close();
	}
	
}

	
	



