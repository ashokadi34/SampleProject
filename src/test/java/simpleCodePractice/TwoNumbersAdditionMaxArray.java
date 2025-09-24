package simpleCodePractice;

public class TwoNumbersAdditionMaxArray {

	public static void main(String[] args) {
		
		int arr[]={5,7,6,8,4,3,2,9};
		int max = 0;								//Integer.MIN_VALUE; // Initialize max to the smallest possible value
		
	     for (int i = 0; i < arr.length; i++) 
	     {
	         for (int j = i + 1; j < arr.length; j++) 
	         { 											// Start j from i + 1 to avoid same element addition
	                int output = arr[i] + arr[j];
	                if (output > max) 
	                {
	                	  max = output;
	                    
	                }
	         }  
	     }
	        System.out.println("Two numbers addition max is: " + max);

	}

}
