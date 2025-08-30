package simpleCodePractice;

public class FactorialNumbers {

	public static void main(String[] args) {

		int num=5;
		System.out.println("Given number: "+num);
		int fact=1;
		for(int i=1; i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial for given number: "+fact);
	
	}

}
