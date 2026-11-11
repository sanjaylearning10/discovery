package changecigniti;

public class CheckSubArraySumIsZero {

	public static void main(String[] args) {
		//int[] array={12, 4, -16, 2, 5,3,8,3,7,6};
		int[] array={ 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
		
		
		for(int i=0;i<array.length;i++)
		{	
			int sum=0;
			for(int j=i+1;j<array.length;j++)
			{	
				sum=sum+array[j];
				if(sum+array[i]==0)
				{
					System.out.println("Elements are "+ i+" and "+ j);
					
				}
						
		}
		}
		

	}

}
