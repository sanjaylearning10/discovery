package changecigniti;

import java.util.Arrays;

public class CheckMaxProductOfTwoElement1 {

	public static void main(String[] args) {
		
		int[] array={ 5, 6, -5, 5, 3, 5, 3, -2, 0 };
		
		
		System.out.println("Unsorted Array is  "+ Arrays.toString(array));
		
		for(int i=0;i<array.length;i++)
		{	
			for(int j=i+1;j<array.length;j++)
			{		
				if(array[i]>array[j])
				{		
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}		
		}
		}
		System.out.println("Sorted Array is "+ Arrays.toString(array));	
		
		System.out.println("Max producet of two element of Array is "+ array[array.length-1]*array[array.length-2]);	
	}

}
