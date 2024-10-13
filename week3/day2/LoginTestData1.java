package week3.day2;

public class LoginTestData1 extends TestData{

	public void enterUsername() 
	
	{
		System.out.println("enterUsername LoginTestData1");
	}
	public void enterPassword() 
	
	{
		System.out.println("enterPassword LoginTestData1");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LoginTestData1 obj1 = new LoginTestData1();
		obj1.enterCredentials();
		obj1.enterPassword();
		obj1.enterUsername();
		obj1.navigateToHomePage();
		

	}

}
