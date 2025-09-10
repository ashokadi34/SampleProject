package simpleCodePractice;

public class ReverseTheInt {

	public static void main(String[] args) {

		int n = 12345;
		int rev = 0;
		
		for(;n!=0;n=n/10)
		{
			int r=n%10;
			rev= rev*10+r;
		}
		
		System.out.println("reverseOfInt: "+rev);
		
	
	}

}
