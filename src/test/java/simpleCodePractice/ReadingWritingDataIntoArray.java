package simpleCodePractice;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingWritingDataIntoArray {

	public static void main(String[] args) {

		
		int a[]=new int[5];
		
		Scanner sc=new Scanner(System.in);
		
		
		for(int i=0;i<a.length;i++) 
		{
			System.out.print("Enter a value for the position "+ i +" : ");
			a[i]=sc.nextInt();
		}
		
		System.out.println("Printing Array with Elements.......");
		System.out.println(Arrays.toString(a));
		
	
	}

}
