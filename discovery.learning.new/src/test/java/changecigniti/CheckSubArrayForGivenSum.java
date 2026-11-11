package changecigniti;

public class CheckSubArrayForGivenSum {

	public static void main(String[] args) {
		
		int[] array={ 5, 6, -5, 5, 3, 5, 3, -2, 0 };
		
		int maxSum=8;
		
		for(int i=0;i<array.length;i++)
		{	
			int sum=array[i];
			for(int j=i+1;j<array.length;j++)
			{	
				sum=sum+array[j];
				if(sum==maxSum)
				{	
					
					System.out.println("Elements are "+ i+" and "+ j);
					
					
				}
						
		}
		}
				

	}

}
