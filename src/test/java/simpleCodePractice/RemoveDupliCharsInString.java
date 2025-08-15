package simpleCodePractice;

import java.util.stream.Collectors;

public class RemoveDupliCharsInString {

	public static void main(String[] args) {

		String str="programming";			
		String res=str.chars().distinct().mapToObj(c->(char)c).map(String::valueOf).collect(Collectors.joining());
		System.out.println("Given String :"+str);
		System.out.println("StringAfterRemoveDuplicates: "+res);
		
	}

}
