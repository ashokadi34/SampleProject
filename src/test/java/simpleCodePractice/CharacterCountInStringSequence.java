package simpleCodePractice;

public class CharacterCountInStringSequence {

	public static void main(String[] args) {

		String str="abbdcccdddd";
		System.out.println("Given String: "+str);
		StringBuilder sb=new StringBuilder();			
		for(int i=0;i<str.length();i++)
		{
			int cou=1;
			while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
			{	
				cou++;
				i++;
			}
				sb.append(str.charAt(i)).append(cou);
		}
			System.out.println("Output: "+sb.toString());		
	
	}

}
