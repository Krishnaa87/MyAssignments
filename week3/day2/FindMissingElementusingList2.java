package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class FindMissingElementusingList2 {

	public static void main(String[] args) {
	
		List<Integer>	 lst1 = new ArrayList<>();	
		
int arr1 [] = {1,2,3,4,10,6,8};

Arrays.sort(arr1);

for(int i=0; i < arr1.length-1;i++)
{
	if (arr1[i+1] > arr1[i]+1)
	{
		
		int v1 =(arr1[i+1]-arr1[0]);

	lst1.add(v1);

	}

}

	
	for (int i = 0;i<lst1.size(); i++)
	{
		System.out.println(lst1.get(i));
	}

	}

}
