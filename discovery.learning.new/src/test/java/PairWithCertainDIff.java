
public class PairWithCertainDIff {

	public static void main(String[] args) {
		int[] arr = {1, 5, 2, 2, 2, 5, 5, 4};
		int k = 3; 
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]-arr[i]==k)
				{
					System.out.println("Sub arrays pairs are ::=>"+arr[i]+"  "+arr[j]);
				}
			}
		}
	}

}
