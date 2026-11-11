package changecigniti;

public class PaitWithDesiredSum {

	public static void main(String[] args) {
		int[] array={12, 4, 5, 2, 5,3,8,3,7,6};
		int sum=20;
		
		
		for(int i=0;i<array.length;i++)
		{	
			for(int j=i+1;j<array.length;j++)
			{	
				if(array[i]+array[j]==sum)
				{
					System.out.println("Elements are "+ array[i]+" and "+ array[j]);
				}
						
		}
		}
		

	}

}
