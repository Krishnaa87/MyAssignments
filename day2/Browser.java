package week1.day2;

public class Browser {
	
	
	public String launchBrowser(String browserName)
	{
		
		System.out.println("Browser launched successfully");
		return browserName;
	}
	
	public String browserName()
	{
		return"Google Chrome";
	}
	public void loadUrl()
	{
		System.out.println("Application url loaded successfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser name = new Browser();
		name.launchBrowser("GoogleChrome");
		name.loadUrl();
		

	}

}
