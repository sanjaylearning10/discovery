package cignitibench;

public class ReverseCharacterOfAWords {

	public static void main(String[] args) {
		String str= "Hello";
			char[] charArray=str.toCharArray();	
			for(int j=0;j<charArray.length/2;j++)
			{
				char temp;
				temp=charArray[j];
				charArray[j]=charArray[charArray.length-1-j];
				charArray[charArray.length-1-j]=temp;
			}		
			System.out.println(str);
			System.out.println("********************************");
			
			for(int i=0;i<charArray.length;i++)
			{
				System.out.println(charArray[i]+" ");
			}
	}

}
