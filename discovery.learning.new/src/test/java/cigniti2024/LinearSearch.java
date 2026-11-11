package cigniti2024;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34}; 
		int key=12;
		System.out.println("Provided Element is available "+ SearchElementByLinearSearch(array,key));
		
		
	}
	
	public static boolean SearchElementByLinearSearch(int[] array, int key)
	{
		boolean flag=false;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==key)
			{
				 flag=true;
				 break;
			}
			else 
			
				flag=false;
			
		}
		return flag;

		
	}

}
