package changecigniti;

import java.util.Arrays;

public class SortBinaryArray {

	public static void main(String[] args) {
		int[] array= { 1, 0, 1, 0, 1, 0, 0, 1 };
		
		int countOne=0;
		
		System.out.println("UnSorted array is " + Arrays.toString(array));
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==1)
			{
				countOne++;
			}
			
		}
		for(int i=0;i<array.length-countOne;i++)
		{
			array[i]=0;
		}
		for(int i=countOne;i<array.length;i++)
		{
			array[i]=1;
		}
		System.out.println("Sorted array is " + Arrays.toString(array));
		
		

	}

}
