package simpleCodePractice;

import java.util.ArrayList;
import java.util.Arrays;

public class FindCommonElements {

	public static void main(String[] args) {

        // Initialize two ArrayLists
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 8));

        // Create an ArrayList to store common elements
        ArrayList<Integer> commonElements = new ArrayList<>();

        // Find common elements
        for (int i = 0; i < list1.size(); i++) {
            if (list2.contains(list1.get(i))) {
                commonElements.add(list1.get(i));
            }
        }
        
       // Print the common elements
        System.out.println("Common elements: " + commonElements);
    
	}

}
