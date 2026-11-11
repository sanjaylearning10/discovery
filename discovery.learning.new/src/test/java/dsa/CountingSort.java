package dsa;

import java.util.Arrays;

public class CountingSort {

	public static void main(String[] args) {
		int[] data= {1,0,2,1,0,1,1,5,6,7,5,4,2,2,0,0,1};
		sortArray(data);
		displayArray(data);

	}
	
	public static void sortArray(int[] array)
	{
		int[] output = new int[array.length];
		int max_Element=array[0];
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>max_Element)
			{
				max_Element=array[i];
			}
		}
		System.out.println("Max Element of array is "+ max_Element);
		
		int [] count = new int[max_Element +1];
		
		//initialse the count array with 0 number
		for(int i=0;i<count.length;i++)
		{
			count[i]=0;
		}
		
		//store the count of each element
		for(int i=0;i<array.length;i++)
		{
			count[array[i]]=count[array[i]]+1;
		}
		
		//done the cummulative count of each array
		for(int i=1;i<count.length;i++)
		{
			count[i]=count[i]+count[i-1];
		}
		
		//Find the index of each elemnet of the original array
		for(int i=array.length-1;i>=0;i--)
		{
			//output[--count[array[i]]]=array[i];
			output[count[array[i]]-1]=array[i];
			count[array[i]]--;
			
		}
		
		for(int i=0;i<array.length;i++)
		{
			array[i]=output[i];
		}
	}
	
	
	public static void displayArray(int[] array)
	{
		System.out.println(Arrays.toString(array));
	}
	

}
