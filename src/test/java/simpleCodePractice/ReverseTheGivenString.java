package simpleCodePractice;

public class ReverseTheGivenString {

	public static void main(String[] args) {		
		
		String originalStr = "HELLO*JAVA";
		String reversedStr = "";
		
		  for(int i=0; i<originalStr.length();i++) 
		  {
			  reversedStr=originalStr.charAt(i)+reversedStr;
		  } 
		  
		  System.out.println("Original String word: "+originalStr);
		  System.out.println("Reversed String word: "+reversedStr);

	}

}
