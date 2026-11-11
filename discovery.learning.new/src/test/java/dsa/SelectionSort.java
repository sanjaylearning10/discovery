package dsa;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] data= {5, -2, 23, 7, 87, -42, 509};
		sortArray(data);
		displayArray(data);

	}
	
	public static void sortArray(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			int min_index=i;
			for(int j=i+1;j<array.length;j++)
			{
				if(array[min_index]>array[j])
				{
						min_index=j;
				}
			}
			
			int temp=array[min_index];
			array[min_index]=array[i];
			array[i]=temp;
		}
	}
	
	
	public static void displayArray(int[] array)
	{
		System.out.println(Arrays.toString(array));
	}
	

}
