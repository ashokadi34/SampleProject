package simpleCodePractice;

import java.util.HashMap;

public class FrequencyOfCharactersInGivenString {

	public static void main(String[] args) {
		
		String str = "my name is google";        
        char arr[] = str.toCharArray(); 
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

        for (char c : arr) 
        {
            if (hm.containsKey(c)) 
            {
                hm.put(c, hm.get(c) + 1);
            } 
            else
            {
                hm.put(c, 1);
            }
        }
        
        System.out.println(hm);
		
	}

}
