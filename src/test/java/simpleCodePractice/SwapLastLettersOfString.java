package simpleCodePractice;

public class SwapLastLettersOfString {

	public static void main(String[] args) {


		String string1 = "java";
        String string2 = "phython";
        // Get the last letters of both strings
        char lastChar1 = string1.charAt(string1.length() - 1);
        char lastChar2 = string2.charAt(string2.length() - 1);
        // Swap the last letters
        String newString1 = string1.substring(0, string1.length() - 1) + lastChar2;
        String newString2 = string2.substring(0, string2.length() - 1) + lastChar1;
        System.out.println("Original - String 1:" + string1+" String 2:"+string2);	       
        System.out.println("New - String 1:" + newString1+" String 2:"+newString2); 	        
	
		
	}

}
