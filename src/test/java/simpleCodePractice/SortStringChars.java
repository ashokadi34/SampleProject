package simpleCodePractice;

public class SortStringChars {

	public static void main(String[] args) {

		String str="aBACbcEDed";
		StringBuilder lsb=new StringBuilder(); 
		StringBuilder usb=new StringBuilder();
		for(char ch:str.toCharArray())
		{
			if(Character.isLowerCase(ch))
			{
				lsb.append(ch);
			} 
				else 
				{
					usb.append(ch);
				}
		}
			System.out.println("sortStringChars:"+lsb+" "+usb);
	
	}

}
