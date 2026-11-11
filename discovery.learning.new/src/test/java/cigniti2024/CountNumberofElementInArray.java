package cigniti2024;

import java.util.HashMap;
import java.util.Map;

public class CountNumberofElementInArray {

	public static void main(String[] args) {
		int [] array = new int [] {2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2};  
		Map<Integer,Integer> hashMap=new HashMap<>();
		
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
		
		hashMap.forEach((k,v)->System.out.println(k+" "+v));

		for(Map.Entry<Integer,Integer> entry:hashMap.entrySet())
		{
			if(entry.getValue()>=array.length/2)
			{
				System.out.println("Moore Element" +entry.getKey());
			}
		}
		
	}

}
