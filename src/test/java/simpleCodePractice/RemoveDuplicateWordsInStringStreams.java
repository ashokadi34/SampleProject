package simpleCodePractice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicateWordsInStringStreams {

	public static void main(String[] args) 
	{

		String str="my name is java and this java is good";
		String res=Arrays.stream(str.split(" ")).distinct().collect(Collectors.joining(" "));
		System.out.println("Given String: "+str);
		System.out.println("String after remove Duplicate Words In String(Streams): "+res);	
		
	}

}
