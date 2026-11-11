package medium;

public class FindTheMaximumProductOfTwoIntegersInAnArray_Program7 {

	public static void main(String[] args) {
		int[] array = new int[] {-10, -3, 5, 6, -2};
		int maxProduct=Integer.MIN_VALUE;
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]*array[j]>=maxProduct)
				{
					maxProduct=array[i]*array[j];
					System.out.println("indexes of arrays are::=> "+i+" "+j );
				}
			}
		}
		
		System.out.println("Max Product is " + maxProduct);
	}

}
