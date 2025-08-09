package simpleCodePractice;

import java.util.Arrays;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		
		 String str = "my committee";
	        char[] arr = str.toCharArray(); // Convert the string to a character array
	        int index = 0;

	        for (int i = 0; i < arr.length; i++) {
	            int j;
	            for (j = 0; j < i; j++) {
	                if (arr[i] == arr[j]) {
	                    break;
	                }
	            }

	            if (j == i) {
	                arr[index++] = arr[i]; // Move unique characters to the front of the array
	            }
	        }

	        // Create a new string from the unique characters
	        String result = new String(Arrays.copyOf(arr, index));
	        System.out.println("String after removing duplicates: " + result);
		
	}

}
