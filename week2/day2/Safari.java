package week2.day2;

public class Safari extends Browser{

	
	
	public void readerMode()
	{
		System.out.println("readerMode");
	}
	

	public void fullScreenMode()
	{
		System.out.println("fullScreenMode");

	}
	
	
	public static void main(String[] args) {
	
		Safari browser1 = new Safari();
		
		System.out.println(browser1.browserName);	
		System.out.println(browser1.browserVersion);
		browser1.openURL();
		browser1.closeBrowser();
		browser1.navigateBack();
		browser1.readerMode();
		browser1.fullScreenMode();


System.out.println("***************************");



Chrome browser2 = new Chrome();

System.out.println(browser2.browserName);	
System.out.println(browser2.browserVersion);

browser2.openURL();
browser2.closeBrowser();
browser2.navigateBack();



browser2.openIncognito();
browser2.clearCache();



System.out.println("***************************");

Edge browser3 = new Edge();

System.out.println(browser3.browserName);	
System.out.println(browser3.browserVersion);

browser3.openURL();
browser3.closeBrowser();
browser3.navigateBack();
 browser3.takeSnap();
 browser3.clearCookies();



		
		
		
	}
	
	
	
}
