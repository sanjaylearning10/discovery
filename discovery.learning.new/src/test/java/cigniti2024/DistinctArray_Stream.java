package cigniti2024;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DistinctArray_Stream {

	public static void main(String[] args) {
		int[] array={ 5, 6, -5, 5, 3, 5, 3, -2, 0 };
		//int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};  
		
		System.out.println("Array before sorting");
		System.out.println(Arrays.toString(array));
		
		List<int[]> orgList= Arrays.asList(array);
		
		 orgList.stream().distinct().collect(Collectors.toList());
		
		System.out.println("Array after sorting");
		for(int i=0;i<orgList.size();i++)
		{
			System.out.print(orgList.get(i).toString());
		}
		
		
		
	}

}
