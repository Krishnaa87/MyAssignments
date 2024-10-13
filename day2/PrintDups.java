package week1.day2;

import java.util.Arrays;

public class PrintDups {

	
	
	 public static void main(String[] args) {
	        int arr[] = {2, 3, 5, 2, 3, 5, 7};
	        Arrays.sort(arr);
	        
	        StringBuilder duplicates = new StringBuilder();
	        for (int i = 0; i < arr.length - 1; i++) {
	            if (arr[i] == arr[i + 1]) {
	                // To avoid adding the same duplicate multiple times
	                if (duplicates.length() == 0 || duplicates.charAt(duplicates.length() - 1) != arr[i]) {
	                    if (duplicates.length() > 0) {
	                        duplicates.append(", ");
	                    }
	                    duplicates.append(arr[i]);
	                }
	            }
	        }

	        if (duplicates.length() > 0) {
	            System.out.println(duplicates + " are duplicates.");
	        } else {
	            System.out.println("No duplicates found.");
	        }
	    }
}
