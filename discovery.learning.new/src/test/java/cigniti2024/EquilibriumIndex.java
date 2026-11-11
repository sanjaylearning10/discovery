package cigniti2024;

import java.util.Arrays;

public class EquilibriumIndex {

	public static void main(String[] args) {
		
		int [] array = new int [] {0, -3, 5, -4, -2, 3, 1, 0};  
		
		
		int leftSum=0;
		int rightSum=0;
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				rightSum=rightSum+array[j];
			}

			for(int k=i-1;k>0;k--)
			{
				leftSum=leftSum+array[k];
			}
			
			if(rightSum==leftSum)
			{
				System.out.println("Equilibrium Index"+i);
				continue;
			}
		}
		
		
	}

}
