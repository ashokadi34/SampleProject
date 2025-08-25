package simpleCodePractice;

public class VowelConsonantsCountInString {

	public static void main(String[] args) {

		String str = "Hello World";
		str=str.toLowerCase();		
		int vovelCount=0;
		int consonantCount=0;
			System.out.println("Given String: "+str);
		for(int i=0;i<str.length();i++)
		{	
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z')
			{
				if(ch=='a'|| ch=='e' ||ch=='i'|| ch=='o'||ch=='u') 
				{
					vovelCount++;
					System.err.println("vovel: "+ch);
				} else {
					consonantCount++;
					System.out.println("consonant: "+ch);
				}
			}
		}	
			System.out.println("Total Vovels in String: "+vovelCount);
			System.out.println("Total Consonants in string: "+consonantCount);
	
	}

}
