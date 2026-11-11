package medium;

public class FindAPairWithTheGivenSumInAnArray_Program1 {

	public static void main(String[] args) {
		 int[] array = new int[] {8, 7, 2, 5, 3, 1};
		 int num=10;
		
		// int[] array = new int[] {5, 2, 6, 8, 1, 9};
		//	int num=12;
		 
		 for(int i=0;i<array.length;i++)
		 {
			 for(int j=i+1;j<array.length;j++)
			 {
				 if(array[i]+array[j]==num)
				 {
					 System.out.println("Pairs are::=> "+ array[i]+" "+array[j]);
				 }		 
			 } 
		 }
		 System.out.println("No Pair Found");
		
		

	}

}
