package simpleCodePractice;

public class SwapTwoStrings {

	public static void main(String[] args) {

		String string1 = "java";
        String string2 = "python";
        System.out.println("Before swaping -> String 1: "+string1+" & "+"String 2: "+string2);
//        String temp=string1;
//        string1=string2;
//        string2=temp;
        string1=string1+string2;
        string2=string1.substring(0, string1.length() - string2.length());
		string1=string1.substring(string2.length());
        System.out.println("After swaping -> String 1: "+string1+" & "+"String 2: "+string2);       
			
	}

}
