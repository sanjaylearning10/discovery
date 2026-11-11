package cignitibench;

public class ReverseString {

	public static void main(String[] args) {
		String str= "Hello this is my String";
		
		String[] strArray=str.split(" ");
		for(int i=0;i<strArray.length/2;i++)
		{
			String temp;
			temp=strArray[i];
			strArray[i]=strArray[strArray.length-1-i];
			strArray[strArray.length-1-i]=temp;
		}
		
		for(int i=0;i<strArray.length;i++)
		{
			System.out.print(strArray[i]+" ");
		}

	}

}
