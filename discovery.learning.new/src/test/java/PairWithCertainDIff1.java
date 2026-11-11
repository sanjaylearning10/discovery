import java.util.HashSet;
import java.util.Set;

public class PairWithCertainDIff1 {

	public static void main(String[] args) {
		int[] arr = {1, 5, 2, 2, 2, 5, 5, 4};
		int k = 3; 
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(set.contains(i-k))
			{
				System.out.println("i-k::=> " + (i-k));
			}
			
			if(set.contains(i+k))
			{
				System.out.println("i-k::=> " + (i+k));
			}
			
			set.add(i);
		}
		
	}

}
