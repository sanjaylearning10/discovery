package medium;

import java.util.HashSet;
import java.util.Set;

public class CheckIfASubarrayWith0SumExistsOrNot_Program2_Approach2 {

	public static void main(String[] args) {
		int[] array = new int[] { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
		boolean flag=false;
		Set<Integer> set = new HashSet<Integer>();
		set.add(0);
		int num=0;
		for(int i=0;i<array.length;i++)
		{
				num=num+array[i];
				if(set.contains(num))
				{
					flag=true;
				}
				set.add(num);
		}
		
		System.out.println("value of flag is "+flag);
	}

}
