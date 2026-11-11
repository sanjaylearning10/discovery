package cigniti2024;

import java.util.Arrays;

public class MaxProductofTwoElement {

	public static void main(String[] args) {
		//int[] array={ 5, 6, -5, 5, 3, 5, 3, -2, 0 };
		int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};  
		
		System.out.println("Array before sorting");
		System.out.println(Arrays.toString(array));
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
				{
					int temp= array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		
		System.out.println("Array after sorting");
		System.out.println(Arrays.toString(array));
		
		System.out.println("Max Product of two element :"+ array[array.length-1]*array[array.length-2]);
	}

}
