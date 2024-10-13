package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr1[]  = {"Wipro","HCL","CTS","Aspire Systems"};
		
		List<String> lst1 = new ArrayList<>();
		
		for(int i =0; i<arr1.length;i++)
		{
			lst1.add(arr1[i]);
		}
		
		
		Collections.sort(lst1);
		
	
		for (int i = lst1.size()-1;i>=0;i--)
		{
		
			
			System.out.println(lst1.get(i));
			
		}
		
	}

}
