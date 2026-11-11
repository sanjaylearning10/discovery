package cigniti2024;

import java.util.Arrays;

public class SortArray_BubbleSort {

	public static void main(String[] args) {
		//int[] array={ 5, 6, -5, 5, 3, 5, 3, -2, 0 };
		int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};  
		
		System.out.println("Array before sorting");
		System.out.println(Arrays.toString(array));
		
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=0;j<array.length-i-1;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp= array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		
		System.out.println("Array after sorting");
		System.out.println(Arrays.toString(array));
	}

}
