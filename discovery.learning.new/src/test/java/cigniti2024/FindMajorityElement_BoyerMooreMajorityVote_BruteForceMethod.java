package cigniti2024;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindMajorityElement_BoyerMooreMajorityVote_BruteForceMethod {

	public static void main(String[] args) {
		
		int [] array = new int [] {2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2}; 
		int count=0;
		int majorElement=0;	
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					count=count+1;
				if(count>=array.length/2)
				{
					majorElement=array[i];
				}
				}
			}
		}
		System.out.println("Majority Element is :"+majorElement);
	}
}
