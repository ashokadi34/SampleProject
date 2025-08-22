package simpleCodePractice;

public class PalindromeString {

	public static void main(String[] args) {


		String str="madam";
		String orgStr=str;
		String res="";
		for(int i=str.length()-1;i>=0;i--) {
			res=res+str.charAt(i);
		}
		if(orgStr.equals(res)) {
			System.out.println("palindrome: "+res);			
		}
		else {
			System.out.println("Not palindrome: "+res);
		}	
	
		
	}

}
