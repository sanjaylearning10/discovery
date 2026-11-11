package medium;

public class PrintAllSubarayWithZeroSum_Program3 {

	public static void main(String[] args) {
		
	//	int[] array = new int[] { 4, 2, -3, -1, 0, 4 };
		int[] array =new int[] {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
		
		int sum=0;
		for(int i=0;i<array.length;i++)
		{
			sum=array[i];
			for(int j=i+1;j<array.length;j++)
			{
				sum=sum+array[j];
				
				if(sum==0)
				{
					System.out.println("Subarrays are::=> "+i + " "+ j );
				}
				else if (array[j]==0)
				{
					System.out.println("Element with zero sum are::=> "+ j );
		
				}
			}
		}

	}

}
