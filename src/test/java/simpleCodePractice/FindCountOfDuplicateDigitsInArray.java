package simpleCodePractice;

import java.util.Scanner;

public class FindCountOfDuplicateDigitsInArray {

	public static void main(String[] args) {

		
		int a[]= {1,2,3,4,1,2,2,6,5};
		System.out.println("Given Array: "+(java.util.Arrays.toString(a)));
		int count=0;
		
		Scanner input =new Scanner(System.in);
		System.out.print("Give Input digit: ");
		int num=input.nextInt();
		
		
		for(int value : a)
		{
			if(value==num)
			{
				count++;
			}
		}
		
		System.out.println("Count the duplicate number: "+count);

	
	}

}
