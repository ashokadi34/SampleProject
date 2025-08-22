package simpleCodePractice;

public class PalindromeString {

	public static void main(String[] args) {


		String str="madam";
		String orgStr=str;
		String res="";
		for(int i=str.length()-1;i>=0;i--) {
			res=res+str.charAt(i);
		}
		
		System.out.println("Given String: "+str);
		if(orgStr.equals(res)) {
			System.out.println("String is palindrome: "+res);			
		}
		else {
			System.out.println("String is Not palindrome: "+res);
		}	
	
		
	}

}
