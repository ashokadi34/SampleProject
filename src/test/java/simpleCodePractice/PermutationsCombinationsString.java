package simpleCodePractice;

import java.util.ArrayList;
import java.util.List;

public class PermutationsCombinationsString {

	public static void main(String[] args) {

        String str = "1234567890";
        System.out.println("Given String: "+str);
        int[] cou = {0};

        // Step 1: Generate all 6-character combinations
        List<String> combinations = new ArrayList<>();
        combine(str, "", 6, combinations);	//151200

        // Step 2: For each combination, generate all permutations
        for (String combination : combinations) {
            permute(combination, "", cou);
        }

        System.out.println("Total permutations count: " + cou[0]);
    
	}
	
	// Method to generate all combinations of a specific length
    static void combine(String str, String prefix, int targetLength, List<String> combinations) {
        if (prefix.length() == targetLength) {
            combinations.add(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                combine(str.substring(i + 1), prefix + str.charAt(i), targetLength, combinations);
            }
        }
    }

    // Method to generate all permutations of a given string
    static void permute(String str, String prefix, int[] cou) {
        if (str.length() == 0) {
            System.out.println(prefix);
            cou[0]++;
        } else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                permute(rem, prefix + str.charAt(i), cou);
            }
        }
    }

}
