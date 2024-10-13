package week2.day1;

public class Solution1 {
	


	public static String reverseString(String input) {
	
		
		
		
String reverse ="";
	 if (input == null)
	 {
		 System.out.println("Invalid Output");
	 }
	 
	 else {
	 String  input1 =input;
	for(int i = input1.length()-1; i >=0;i--)
	  {
		char r = input1.charAt(i);
		  
		
		 reverse = reverse +r;
		  
	  }
	 }
	 
	  return reverse;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Solution1 ref1 = new Solution1();
		
		String val = "";
		String resersedString =Solution1.reverseString(null);
		
		
		if (resersedString != null)
			
		{
			
			  System.out.println("The Reversed value  is :"  +resersedString);

		}
		
		
		
		}

	

}
