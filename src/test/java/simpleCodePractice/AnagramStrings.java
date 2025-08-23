package simpleCodePractice;

import java.util.Arrays;

public class AnagramStrings {

	public static void main(String[] args) {

		String str1="listen";
		String str2="silent";
		
		System.out.println("Given two strings: "+str1+" & "+str2);
		
		char[] arr1=str1.toCharArray();
		char[] arr2=str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		boolean isAnagram=Arrays.equals(arr1, arr2);
		
		if(isAnagram)
		{
			System.out.println("Given two strings are ANAGRAMS: "+str1+" - "+str2);
		} else {
			System.out.println("Given two strings are NOT ANAGRAMS: "+str1+" - "+str2);
		}
	
	}

}
