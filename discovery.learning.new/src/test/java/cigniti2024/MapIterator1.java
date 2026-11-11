package cigniti2024;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapIterator1 {

	public static void main(String[] args) {
		
		int [] array = new int [] {2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2};  
		
		Map<Integer,Integer> hashMap= new HashMap<Integer,Integer>();
		
		for(int i=0;i<array.length;i++)
		{
			if(hashMap.containsKey(array[i]))
			{
				hashMap.put(array[i], hashMap.get(array[i])+1);
			}
			else
			{
				hashMap.put(array[i], 1);
			}
		}
		
		hashMap.forEach((k,v)->System.out.println(k+":"+v));
		
		
	}

}
