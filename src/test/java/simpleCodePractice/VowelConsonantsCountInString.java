package simpleCodePractice;

public class VowelConsonantsCountInString {

	public static void main(String[] args) {

		String str = "Hello World";
		str=str.toLowerCase();		
		int vovelCount=0;
		int consonantCount=0;
		for(int i=0;i<str.length();i++)
		{	
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z')
			{
				if(ch=='a'|| ch=='e' ||ch=='i'|| ch=='o'||ch=='u') 
				{
					vovelCount++;
					System.out.println("vo:"+ch);
				} else {
					consonantCount++;
					System.out.println("co:"+ch);
				}
			}
		}	
			System.out.println("vovels:"+vovelCount);
			System.out.println("consonant:"+consonantCount);
	
	}

}
