package simpleCodePractice;

public class SwapTwoNumbers {

	public static void main(String[] args) 
	{

		int a=52;
		int b=96;
		System.out.println("Before swap: a-"+a+" & b-"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swap: a-"+a+" & b-"+b);
	
	}

}
