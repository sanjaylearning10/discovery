package cigniti2024;

import java.util.Arrays;

public class SelectionSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};  
		
		System.out.println(" Array before sorting") ;
		System.out.println(Arrays.toString(array));
		
		for(int i=0;i<array.length;i++)
		{
			int min_idx=i;
			for(int j=i+1;j<array.length;j++)
			{
				if(array[j]<array[min_idx])
				{
				min_idx=j;	
				}
			}
			int temp=array[min_idx];
			array[min_idx]=array[i];
			array[i]=temp;
		}
		
		System.out.println(" Array After sorting") ;
		System.out.println(Arrays.toString(array));

	}

}
