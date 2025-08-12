package simpleCodePractice;

public class ReverseEachWordInGivenString {

	public static void main(String[] args) {


		String str="My name is Java";
		//Output: yM eman si avaJ
		String[] words=str.split(" ");
		String reverseString = "";		
		for(int i=0;i<words.length;i++)
		{	
			String word=words[i];
			String nstr="";
			char ch;			
			for(int j=0;j<word.length();j++)
			{
				ch=word.charAt(j);
				nstr=ch+nstr;				
			} 			
			reverseString=reverseString+nstr+" ";			
		} System.out.println("reverseEachWordOfString:"+reverseString);
	
		
	}

}
