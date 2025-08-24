package simpleCodePractice;

public class SortCapitalSmallCharsString {

	public static void main(String[] args) {

		String str="aBACbcEDed";
		StringBuilder lowersb=new StringBuilder(); 
		StringBuilder uppersb=new StringBuilder();
		for(char ch:str.toCharArray())
		{
			if(Character.isLowerCase(ch))
			{
				lowersb.append(ch);
			} 
				else 
				{
					uppersb.append(ch);
				}
		}
			System.out.println("Given String: "+str);
			System.out.println("Sorted Chars in String: "+lowersb+" "+uppersb);
	
	}

}
