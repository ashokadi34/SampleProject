package simpleCodePractice;

public class PalindromeNumber {

	public static void main(String[] args) {

		int num=4224;
		System.out.println("Given number: "+num);
		int orgNum=num;
		int rev=0;
		for(;num!=0;num=num/10) {
			int r=num%10;
			rev=rev*10+r;			
		}
		
		if(orgNum==rev) {
			System.out.println("Number is palindrome: "+rev);			
		}
		else {
			System.out.println("Number is not palindrome: "+rev);
		}			
	
	}

}
