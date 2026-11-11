package changecigniti;

public class CheckMaxProductOfTwoElement {

	public static void main(String[] args) {
		
		int[] array={ 5, 6, -5, 5, 3, 5, 3, -2, 0 };
		
		
		int prod =Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++)
		{	
			
			for(int j=i+1;j<array.length;j++)
			{	
				
				if(prod<array[i]*array[j])
				{	
					prod=array[i]*array[j];		
					System.out.println("Elements are "+ i+" and "+ j);
					System.out.println("Element of array are " + array[i]+" "+ array[j]);
					
				}
						
		}
		}
				

	}

}
