package simpleCodePractice;

public class LengthOfTheGivenString {

	public static void main(String[] args) {

		String str= "programming";
		char arr[]=str.toCharArray();
		int count=0;
		for(char a : arr) {
			count++;
		}
		System.out.println("Length of the string: "+count);
	}

}
