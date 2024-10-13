package week3.day2;

public class APIClient {

	
	
	public void sendRequest(String endpoint)
	{
		System.out.println("endpoint is displaying :"+ endpoint);
	}
	public void sendRequest(String requestBody,boolean requestStatus)
	{
		
		
		if (requestStatus == true)
		{
			System.out.println("requestStatus is Successfully :" +requestStatus );
		}
		
		else
		{
			System.out.println("requestStatus is not Successfully :" +requestStatus );

		}
		System.out.println("requestBody and requestStatus are displaying :"+ requestBody +" "+requestStatus );
	}
	public static void main(String[] args) 
	{
		APIClient api = new APIClient();
		api.sendRequest("https://test.com");
		api.sendRequest("TestRequestBody", true);
	}

}
