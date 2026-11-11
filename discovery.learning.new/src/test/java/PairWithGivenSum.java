import java.util.HashMap;
import java.util.Map;

public class PairWithGivenSum {

	public static void main(String[] args) {
		int[] array = {8, 7, 2, 5, 3, 1};
		int target=10;
		findPair(array,target);
		
	}
	
	public static void findPair(int [] array, int target)
	{
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
			
			for(int i=0;i<array.length;i++)
			{
			
					if(map.containsKey(target-array[i]))
					{
						System.out.println(array[map.get(target - array[i])]);
						System.out.println(array[i]);
			            break;
					}
					map.put(array[i], i);
			}
			
			System.out.println("Pair Not Found");
	}

}
//2, 3, 8, 5, 7, 9