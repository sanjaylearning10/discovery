package changecigniti;

public class CheckSubArrayForGivenSumWithMaximumLength {

	public static void main(String[] args) {
		
		int[] array={ 5, 6, -5, 5, 3, 5, 3, -2, 0 };
		
		int maxSum=8;
		int arrayLength =Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++)
		{	
			int sum=array[i];
			for(int j=i+1;j<array.length;j++)
			{	
				sum=sum+array[j];
				if(sum==maxSum)
				{	
					if(j-i>arrayLength)
					{
						arrayLength=j-i;	
					System.out.println("Elements are "+ i+" and "+ j);
					System.out.println("maxmimum lengh of array is " + (arrayLength+1));
					}
				}
						
		}
		}
				

	}

}
