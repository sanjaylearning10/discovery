package cigniti2024;

import java.util.Arrays;

public class SortArray_SelectionSort {

	public static void main(String[] args) {
		//int[] array={ 5, 6, -5, 5, 3, 5, 3, -2, 0 };
		int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};  
		
		System.out.println("Array before sorting");
		System.out.println(Arrays.toString(array));
		
		for(int i=0;i<array.length;i++)
		{
			int min_idx=i;
			for(int j=i+1;j<array.length;j++ )
			{
				if(array[j]>array[i])
				{
					int temp= array[i];
					array[i]=array[j];
					array[j]=temp;
				}
				min_idx=j;
			}
		}
		
		System.out.println("Array after sorting");
		System.out.println(Arrays.toString(array));
	}

}
