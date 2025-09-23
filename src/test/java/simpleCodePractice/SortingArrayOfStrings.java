package simpleCodePractice;

import java.util.Arrays;

public class SortingArrayOfStrings {

	public static void main(String[] args) {

		String s[]= {"Cat","Apple","Dog","Bat"};
		
		System.out.println("Before sorting... "+ Arrays.toString(s));
		
		Arrays.sort(s);
		
		System.out.println("After sorting... "+ Arrays.toString(s));
	
	}

}
