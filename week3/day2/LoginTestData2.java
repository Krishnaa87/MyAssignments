package week3.day2;

public class LoginTestData2 extends TestData {
	
public void enterUsername() 
	
	{
		System.out.println("enterUsername LoginTestData2");
	}
	public void enterPassword() 
	
	{
		System.out.println("enterPassword LoginTestData2");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginTestData2 obj1 = new LoginTestData2();
		obj1.enterCredentials();
		obj1.enterPassword();
		obj1.enterUsername();
		obj1.navigateToHomePage();
		
		

	}

}
