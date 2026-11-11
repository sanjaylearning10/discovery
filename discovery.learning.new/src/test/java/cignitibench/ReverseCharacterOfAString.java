package cignitibench;

public class ReverseCharacterOfAString {

	public static void main(String[] args) {
		String str= "Hello this is my String";
		
		String[] strArray=str.split(" ");
		for(int i=0;i<strArray.length;i++)
		{
			
			char[] charArray=strArray[i].toCharArray();
			
			for(int j=0;j<charArray.length/2;j++)
			{
			
				char temp;
				temp=charArray[j];
				charArray[j]=charArray[charArray.length-1-j];
				charArray[charArray.length-1-j]=temp;
			}
			
			for(int k=0;k<charArray.length;k++)
			{
				System.out.print(charArray[k]+" ");
				System.out.println();
			}
		}
		
		
	}

}
