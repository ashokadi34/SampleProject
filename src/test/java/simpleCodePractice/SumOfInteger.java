package simpleCodePractice;

public class SumOfInteger {

	public static void main(String[] args) {

		int n =12345;
		System.out.println("Given Integer: "+n);
		int sum = 0;
		
		for(;n!=0;n=n/10)
		{
			int s=n%10;
			sum=sum+s;
		}
		
		System.out.println("Sum Of Int: "+sum);
	
	}

}
