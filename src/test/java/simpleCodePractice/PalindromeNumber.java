package simpleCodePractice;

public class PalindromeNumber {

	public static void main(String[] args) {

		int num=42245;
		int orgNum=num;
		int rev=0;
		for(;num!=0;num=num/10) {
			int r=num%10;
			rev=rev*10+r;			
		}
		
		if(orgNum==rev) {
			System.out.println("palindrome: "+rev);			
		}
		else {
			System.out.println("Not palindrome: "+rev);
		}			
	
	}

}
