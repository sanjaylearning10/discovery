package changecigniti;

public class MaximumElement {

	public static void main(String[] args) {
		int[] array={12, 4, 5, 2, 5,3,83,76};
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
		}
		
		System.out.print("Maximum Element of array is " + max);

	}

}
