package simpleCodePractice;

public class CountOfDigitsInInteger {

	public static void main(String[] args) {

		
		int n = 12345;
		System.out.println("Given Integer: "+n);
//		int numberOfDigits = String.valueOf(n).length();	
//		System.out.println("Count : "+numberOfDigits);
		int count = 0;
		
		for(;n!=0;n=n/10)
		{
			count++;
		}
		
		System.out.println("Count Of Digits In Integer: "+count);
	
	}

}
