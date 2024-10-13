package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
int[] arr1 = {3,2,11,4,6,7} ;

Arrays.sort(arr1);


List<Integer> lst1 = new ArrayList<>();


for (int i =0 ; i < arr1.length;i++)
	
{
	lst1.add(arr1[i]);
}



System.out.println(lst1.get(lst1.size()-2));

	}

}
