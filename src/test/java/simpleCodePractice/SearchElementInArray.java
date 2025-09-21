package simpleCodePractice;

import java.util.Scanner;

public class SearchElementInArray {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);		

		int[] array = { 1, 2, 3, 4, 5 };
		System.out.println("Given Array: "+(java.util.Arrays.toString(array)));
		
		System.out.print("Enter searchable number in array: ");
		int search_element = input.nextInt();
		
		boolean status = false; // ***Must need boolean variable***
		
		/*
		 * for(int i=0; i<array.length;i++) { if (array[i]==search_element) {
		 * System.out.println("Elemenet found"); status=true; break; } }
		 */
		 
		for (int x : array) 
		{
			if (x == search_element) 
			{
				System.out.println("Elemenet found");
				status = true;
				break;
			} 
		}

			if (status == false) 
			{
				System.err.println("Elemenet not found");
			}

		
	}

}
