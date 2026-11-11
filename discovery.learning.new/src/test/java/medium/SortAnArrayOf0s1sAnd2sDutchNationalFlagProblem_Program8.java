package medium;

public class SortAnArrayOf0s1sAnd2sDutchNationalFlagProblem_Program8 {

	public static void main(String[] args) {
	int[] array =new int[]{ 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 };
	int[] newArray =new int[array.length];
	
	int countZero=0;
	int countOne=0;
	int countTwo=0;
	
	for(int i=0;i<array.length;i++)
	{
		if(array[i]==0)
			countZero++;
		else if (array[i]==1)
			countOne++;
		else if (array[i]==2)
			countTwo++;
	}
	
	for(int i=0;i<newArray.length;i++)
	{
		newArray[i]=0;
	}
	
	for(int i=countZero;i<newArray.length;i++)
	{
		newArray[i]=1;
	}
	
	for(int i=(countZero+countOne);i<newArray.length;i++)
	{
		newArray[i]=2;
	}
	
	System.out.println("Number of Zero are  ::=> "+countZero);
	System.out.println("Number of One are  ::=> "+countOne);
	System.out.println("Number of Two are  ::=> "+countTwo);
	
	for(int i=0;i<newArray.length;i++)
	{
		System.out.println("Sorted array is ::=> "+newArray[i]);
	}
	
	}

}
