package simpleCodePractice;

public class CountOfDigitsInInteger {

	public static void main(String[] args) {

		
		int n = 12345;
		//int numberOfDigits = String.valueOf(n).length();
		int count = 0;
		
		for(;n!=0;n=n/10)
		{
			count++;
		}
		
		System.out.println("countOfInt: "+count);
	
	}

}
