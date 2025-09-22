package simpleCodePractice;

import java.util.Arrays;

public class SecondLargestAndSmallestInArray {

	public static void main(String[] args) {

        // Initialize the array
        int[] array = {12, 35, 1, 10, 5, 1, 4, 28};
        System.out.println("Given Array: "+(java.util.Arrays.toString(array)));

        // Sort the array
        Arrays.sort(array);
        
        // Find the second smallest number
        int secondSmallest = array[1+1];

        // Find the second largest number
        int secondLargest = array[array.length - 2];

        // Print the results
        System.out.println("Second Smallest Number: " + secondSmallest);
        System.out.println("Second Largest Number: " + secondLargest);
    
	}

}
