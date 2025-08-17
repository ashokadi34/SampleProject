package simpleCodePractice;

public class RemoveSpecialCharsInString {

	public static void main(String[] args) {

		String str="j!ava@# %i^s%^ &*G*o*od(@#$";		
		String res="";	
		int cou=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(!Character.isDigit(str.charAt(i)) && !Character.isAlphabetic(str.charAt(i)) && !Character.isWhitespace(str.charAt(i)))
			{
				cou++;
			}
			else
			{
				
				res=res+str.charAt(i);
			}
		}
			System.out.println("Given String: "+str);
			System.out.println("removeSpecialCharsInString: "+res+" "+"[number of special chars in string: "+cou+"]");
			
	}

}
