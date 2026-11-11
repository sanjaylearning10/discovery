package medium;

public class FindMaximumLengthSubarrayHavingAGivenSum_Program5 {

	public static void main(String[] args) {
		int[] array = new int[] {5, 6, -5, 5, 3, 5, 3, -2, 0};
		
		int maxLength=0;
		int target=8;
		int sum=0;
		int diff=Integer.MIN_VALUE;
		
		for(int i=0;i<array.length;i++)
		{
			sum=array[i];
			for(int j=i+1;j<array.length;j++)
			{
				sum =sum+array[j];
				if(sum==target) {
					maxLength=j-i+1;	
					if(maxLength>diff)
					{
						diff=maxLength;
						System.out.println("Maximum Difference is ::=>"+diff);
						System.out.println("Value of subarray is ::=>"+i+" "+"::"+j);				
					}
				}
			}
		}

	}

}
