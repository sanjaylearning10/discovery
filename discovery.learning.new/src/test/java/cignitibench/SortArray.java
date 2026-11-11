package cignitibench;

public class SortArray {
	
	public static void sortArray(int[] array)
	{
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=0;j<array.length-i-1;j++)
			{
			
				if(array[j]>array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
				
			}
		}
	}

	public static void displayArray(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.println("Element of array is::=> "+ array[i]);
		}
	}
	public static void main(String[] args) {
		int[] array = new int[] {90, 23, 5, 109, 12, 22, 67, 34};
		sortArray(array);
		displayArray(array);
		
		
		

	}

}
