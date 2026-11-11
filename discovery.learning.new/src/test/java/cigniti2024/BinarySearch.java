package cigniti2024;

public class BinarySearch {

	public static void main(String[] args) {
		
		int [] array = new int [] {3, 4, 5, 6, 7, 8, 9,12,22,23,73,90,109}; 
		int key=99;
		BinarySearch obj=new BinarySearch();
		System.out.println("Result of provided search is ::" +obj.SearchElementByBinarySearch(array,key,0,array.length-1));
		
	}	
	public  int SearchElementByBinarySearch(int[] array, int key, int low, int high)
	{
		int mid =(low+high)/2;
		while(low<=high) {
			if(array[mid]==key)
			{
				return mid;
			}
			else if(array[mid]>key)
			{
				return SearchElementByBinarySearch(array,key,low,mid-1);	
			}
			else if(array[mid]<key)
			{
				return SearchElementByBinarySearch(array,key,mid+1,high);	
			}
		}
				return -1;
		}
}
