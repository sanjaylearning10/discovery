package cigniti2024;

import java.util.Arrays;

public class SelectionSort3 {

	public static void main(String[] args) {
		int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34}; 
		System.out.println("Before Sorting arrays is "+ Arrays.toString(array));
		for(int i=0;i<array.length;i++)
		{
			int min_indx=i;
			for(int j=i+1;j<array.length;j++)
			{
				if(array[min_indx]<array[j])
				{
					min_indx=j;
				}
				int temp=array[min_indx];
				array[min_indx]=array[j];
				array[j]=temp;
			}		
		}			
		System.out.println("After Sorting arrays is "+ Arrays.toString(array));
	}

}
