package cigniti2024;

import java.util.Arrays;

public class SearchElementinArray_BinarySearch {

	public static void main(String[] args) {
		
		int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};  
		boolean flag=false;
		
		int num=91;
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==num)
			{
				flag=true;
			}
		}
		
		if(flag)
		{	
			System.out.println("Element found in Array");
		}
		else
		{
			System.out.println("Element not found in Array");
		}
	}

}
