package changecigniti;

public class FindElementinArray {

	public static void main(String[] args) {
		int[] array={12, 4, 5, 2, 5,3,83,76};
		int element=3;
		int index=-1;
		boolean flag=false;
		
		for(int i=0;i<array.length;i++)
		{	
			if(array[i]==element)
			{
				index=i;
				flag=true;
			}
			
		}
	
		if(flag)
		{
			System.out.println("Element found at "+ index  );	
		}
		else
		{
			System.out.println("Desired Element is not found");
		}
		

	}

}
