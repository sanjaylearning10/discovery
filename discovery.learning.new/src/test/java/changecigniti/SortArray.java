package changecigniti;

public class SortArray {

	public static void main(String[] args) {
		int[] array={12, 4, 5, 2, 5,3,83,76};
		
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
			
			if(array[i]<array[j])
			{
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
			}
		}
		System.out.println("Sorted array is " );
		
		for(int i=0;i<array.length;i++)
		{
			System.out.print( array[i]);
			System.out.println();
		}

	}

}
