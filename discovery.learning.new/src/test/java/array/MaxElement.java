package array;

public class MaxElement {

	public static void main(String[] args) {
		int[] arr = {90,80,10,4,1980,60,4467,890,30};
		System.out.println("Maximum Element of array is::=> "+ maxElement(arr));

	}
	
	public static int maxElement(int[] array)
	{
		int max_Element=Integer.MIN_VALUE;
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>max_Element)
			{
				max_Element=array[i];
			}
		}
		
		return max_Element;
		
	}

}
