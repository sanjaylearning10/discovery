package medium;

public class SortBinaryArrayInLinearTime_Program4 {

	public static void main(String[] args) {
		int[] array =new int[] { 1, 0, 1, 0, 1, 0, 0, 1 ,0};
		int[] sortedArray =new int[array.length] ;
		
		int countZero=0;
		int countOne=0;
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==0)
			{
				countZero++;
			}
			else
				countOne++;
		}
		
		for(int i=0;i<countZero;i++)
		{
			sortedArray[i]=0;
		}
		for(int i=countZero;i<sortedArray.length;i++)
		{
			sortedArray[i]=1;
		}
		for(int i=0;i<sortedArray.length;i++)
		{
			System.out.println("Elements of array are"+sortedArray[i]);
		}
	}

}
