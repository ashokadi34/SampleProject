package simpleCodePractice;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWordsInString {

	public static void main(String[] args) {


		String str="Test Automation Java Automation";
		String[] arr=str.split(" ");
		HashMap<String,Integer> map=new HashMap<>();
		for(String s:arr)
		{
			if(map.containsKey(s)) 
			{
				map.put(s, map.get(s)+1);
			} else {
				map.put(s, 1);
			}
		} 	
			System.out.println("dupliWord:"+map);
			Set<String> wordsIn=map.keySet();
			for(String word:wordsIn)
			{
				if(map.get(word)>1) 
				{
					System.out.println("dupliWord:"+word+":"+map.get(word)+" ");
				}
			}
	
		
	}

}
