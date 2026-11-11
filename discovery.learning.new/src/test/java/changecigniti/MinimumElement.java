package changecigniti;

public class MinimumElement {

	public static void main(String[] args) {
		int[] array={12, 4, 5, 2, 5,3,83,76};
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]<min)
			{
				min=array[i];
			}
		}
		
		System.out.print("Maximum Element of array is " + min);

	}

}
