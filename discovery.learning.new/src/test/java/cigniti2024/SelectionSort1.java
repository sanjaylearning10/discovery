package cigniti2024;

import java.util.Arrays;

public class SelectionSort1 {

	public static void main(String[] args) {
int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};  
		
		System.out.println("Array before sorting");
		System.out.println(Arrays.toString(array));
		
		
		for(int i=0;i<array.length;i++)
		{
			int min_index=i;
			for(int j=i+1;j<array.length;j++)
			{
				if(array[j]<array[min_index]) {
					min_index=j;
				}
			}
			int temp=array[i];
			array[i]=array[min_index];
			array[min_index]=temp;
			
		}
		
		System.out.println("Array After sorting");
		System.out.println(Arrays.toString(array));

	}

}
