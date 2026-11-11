package cigniti2024;

import java.util.Arrays;

public class MoveAllZerosToEnd {

	public static void main(String[] args) {
	
		int [] array = new int [] { 6, 0, 8, 2, 3, 0, 4, 0, 1, 0, 6, 8, 9, 0 };  
		int[] newArray=new int[array.length];
		int countZero=0;
		int j=0;
		
		
		for(int i=0;i<array.length;i++)
		{
				if(array[i]==0)
				{
					countZero++;	
				}
				else
				{
					newArray[j]=array[i];
					j++;
				}
		}
		
		for(int i=array.length-countZero;i<array.length;i++)
		{
			newArray[i]=0;
		}
		
		System.out.println("Array before moving zero");
		System.out.println(Arrays.toString(array));
		System.out.println("******************************");
		System.out.println("Array after moving zero");
		System.out.println(Arrays.toString(newArray));
	}

}
