package simpleCodePractice;

import java.util.HashSet;

public class FindLongestSubString {

	public static void main(String[] args) {
		
		String str="pwwkew";
		System.out.println("Given String: "+ str);
		int start=0;		
		int maxLength=0;
		String res="";
		HashSet<Character> set=new HashSet<>();
		for(int end=0;end<str.length();end++)
		{
			while(set.contains(str.charAt(end)))
			{
				set.remove(str.charAt(start));
				start++;
			}
				set.add(str.charAt(end));
				if(end-start+1 > maxLength)
				{
					maxLength=end-start+1;
					res=str.substring(start,end+1);
				}
		}		
			//System.out.println("findLongestSubString: "+res+" "+res.length());
			System.out.println("Longest substring: \""+res+"\" "+res.length());
	
	}

}
