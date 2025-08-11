package simpleCodePractice;

public class ReverseWordsInString {

	public static void main(String[] args) {
		
		String str="My name is Java Programming";
		String arr[]=str.split(" ");
		String rev="";
		
		for(int i=arr.length-1;i>=0;i--)
		{
			rev=rev+arr[i]+" ";
		}
		System.out.println("ReverseWordsInString: "+rev);
		
	}

}
