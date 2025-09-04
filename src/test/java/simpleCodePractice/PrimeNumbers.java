package simpleCodePractice;

public class PrimeNumbers {

	public static void main(String[] args) {

		int n=18;
		System.out.println("Given number: "+n);
		boolean isPrime=true;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				isPrime=false;
				break;
			}			
		}
		if(isPrime && n>1) {
			System.out.println(n+" is prime number");
		} else {
			System.out.println(n+" is not prime number");
		}
		
	}

}
