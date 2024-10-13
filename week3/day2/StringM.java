package week3.day2;

public class StringM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String val1 ="Selenium-Java";
		
		String val2 = val1.replace('e','E') ;
		
		System.out.println(val2);
		
		String val3 = val1.replaceAll("[a-z]", "0");
		
		System.out.println(val3);
		
		String amt1 = "5645"; 
		
		
		int amt2 = Integer.parseInt(amt1);
		
		
		System.out.println(amt2);
		

	}

}
