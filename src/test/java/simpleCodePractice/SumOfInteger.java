package simpleCodePractice;

public class SumOfInteger {

	public static void main(String[] args) {

		int n =12345;
		int sum = 0;
		
		for(;n!=0;n=n/10)
		{
			int s=n%10;
			sum=sum+s;
		}
		
		System.out.println("sumOfInt: "+sum);
	
	}

}
