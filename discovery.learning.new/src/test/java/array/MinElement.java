package array;

public class MinElement {

	public static void main(String[] args) {
		int[] arr = {90,80,10,4,1980,60,4467,890,120};
		System.out.println("Maximum Element of array is::=> "+ maxElement(arr));

	}
	
	public static int maxElement(int[] array)
	{
		int min_Element=Integer.MAX_VALUE;
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]<min_Element)
			{
				min_Element=array[i];
			}
		}
		
		return min_Element;
		
	}

}
