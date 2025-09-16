package simpleCodePractice;

import java.util.Scanner;

public class FindCountOfDuplicateDigitsInArray {

	public static void main(String[] args) {

		
		Scanner input =new Scanner(System.in);
		System.out.print("Find count the duplicate number: ");
		int num=input.nextInt();
		
		int a[]= {1,2,3,4,1,2,2,6,5};
		int count=0;
		
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
