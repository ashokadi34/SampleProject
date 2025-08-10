package simpleCodePractice;

public class LengthOfTheString {

	public static void main(String[] args) {

		String str= "programming";
		char arr[]=str.toCharArray();
		int cou=0;
		for(char a : arr) {
			cou++;
		}
		System.out.println(cou);
	}

}
