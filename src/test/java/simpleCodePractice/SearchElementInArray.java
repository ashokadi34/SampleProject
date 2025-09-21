package simpleCodePractice;

import java.util.Scanner;

public class SearchElementInArray {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);

		System.out.print("Enter searchable number in array: ");
		int search_element = input.nextInt();

		int[] array = { 1, 2, 3, 4, 5 };
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
				System.out.println("Elemenet not found");
			}

		
	}

}
