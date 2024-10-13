package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
	
		
		
		int a1 = 0;
		int b1 = 1;
		int range = 8;
		
		System.out.println(a1);
		System.out.println (b1);

		
		
		for (int i = 2; i < range; i++)
		{
	

		  int nextVal = a1 +b1;     	  
		System.out.println(nextVal);	
		  	a1 = b1;
			b1 = nextVal;
			
			
			
		}
		
		
	

	}

}
