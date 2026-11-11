package medium;

public class CheckIfASubarrayWith0SumExistsOrNot_Program2 {

	public static void main(String[] args) {
		int[] array = new int[] { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
		
		int target=0;
		for(int i=0;i<array.length;i++)
		{
			int num=array[i];
			for(int j=i+1;j<array.length;j++)
			{
				
				 target=target+num+array[j];
			
				if(target==0)
				{
					System.out.println("Subaray Exits");
				}
			}
		}
	}

}
