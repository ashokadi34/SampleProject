package simpleCodePractice;

public class DuplicateWordsInStringArray {

	public static void main(String[] args) 
	{

		String[] str = {"abc","xyz","mno","abc","xyz"};
		for(int i=0;i<=str.length;i++) 
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i]==(str[j]))
				{
					System.out.println(str[i]);
				}
			}
		}		
		
	}

}
