package simpleCodePractice;

public class LargestNumberInArray {

	public static void main(String[] args) {
		  
		  
        //Initialize array  
        int [] arr = {25, 11, 7, 75, 56, 83, 96};  
        //Initialize max with first element of array.  
        int max = arr[0];  
        //Loop through the array  
        for (int i = 0; i < arr.length; i++) {  
            //Compare elements of array with max  
           if(arr[i] > max)  // LARGEST NUMBER
//        	   if(arr[i] < max)  // SMALLEST NUMBER
               max = arr[i];  
        }  
        System.out.println("Largest number present in given array: " + max);  
    
	}

}
