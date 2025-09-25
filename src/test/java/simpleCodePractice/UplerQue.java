package simpleCodePractice;

/******************************************************************************************************************
 * 
 ***************************::Question::***********************
 * 
 * Everyone has a favorite number. Jacob's favorite number is X and Jayden's
 * favorite number is Y. A non-empty array A consisting of N integers given.
 * Jacob and Jayden are interested in occurrences of their favorite numbers X
 * and Y in array A. They are looking for the longest leading fragment (prefix)
 * of array A in which there is an equal number of occurrences of X and Y. More
 * formally, they are looking for the largest P, such that 0 ≤ P<N and the
 * number of occurrences of X equals the number of occurrences of Y in the
 * sequence A[0], A[1], ..., A[P].
 * 
 * For example, consider X = 7, Y = 42 and the following array A:
 * 
 * A[0] = 6 A[1] = 42 A[2] = 11 A[3] = 7 A[4] = 1 A[5] = 42
 * 
 * There are three prefixes of array A containing the same number of occurrences
 * of X and Y: P=0: A[0..0] = [6] contains neither 7 nor 42; P=3: A[0..3] = [6,
 * 42, 11, 7] contains one 7 and one 42; P=4: A[0..4] = [6, 42, 11, 7, 1] also
 * contains one 7 and one 42.
 * 
 * The largest value of P we are looking for is 4. because the only longer
 * corresponding prefix A[0..5] contains one 7 and two 42s.
 * 
 * Jacob and Jayden have implemented a function: class solution { public int
 * solution(int x, int Y, int[] A); }
 * 
 * which, given integers X, Y and a non-empty array A consisting of N integers,
 * returns the maximum value of P for which A[0..P] contains the same number of
 * occurrences of X and Y, or -1 If no such value exists.
 * 
 * For example, given integers X, Y and array A as defined above, the function
 * should return 4, as explained above.
 * 
 * For another example, given X-6, Y = 13
 * 
 * A[0] = 13 A[1] = 13 A[2] = 1 A[3] = 6
 * 
 * the function should return -1, because there is no prefix containing the same
 * number of occurrences of 6 and 13.
 * 
 * Given? "Check code for answer"
 * 
 * *******************************::Answer::**********************
 * 
 * "To solve this problem, we need to iterate through the array while keeping
 * track of the occurrences of the favorite numbers X and Y. We then determine
 * the longest prefix where the occurrences of X and Y are equal."
 * 
 * Explanation
 * 
 * 1. **Initialization**: We initialize two counters, `countX` and `countY`, to
 * keep track of the occurrences of `X` and `Y` respectively. We also initialize
 * `maxPrefix` to -1 to handle the case where no such prefix is found.
 * 
 * 2. **Iteration**: We iterate through the array `A`. For each element: - If
 * the element equals `X`, we increment `countX`. - If the element equals `Y`,
 * we increment `countY`. - If `countX` equals `countY`, we update `maxPrefix`
 * to the current index `i`.
 * 
 * 3. **Return Value**: After the loop, `maxPrefix` will contain the index of
 * the longest prefix where the counts of `X` and `Y` are equal. If no such
 * prefix is found, `maxPrefix` will remain -1.
 * 
 * ### Test Cases
 * 
 * - **Example 1**: - Input: `X = 7`, `Y = 42`, `A = [6, 42, 11, 7, 1, 42]` -
 * Output: `4` (The longest prefix with equal counts of `X` and `Y` is `[6, 42,
 * 11, 7, 1]`)
 * 
 * - **Example 2**: - Input: `X = 6`, `Y = 13`, `A = [13, 13, 1, 6]` - Output:
 * `-1` (No prefix with equal counts of `X` and `Y` exists)
 * 
 * This solution ensures that we find the longest prefix where the counts of `X`
 * and `Y` are equal efficiently by traversing the array only once, making it an
 * O()N solution where N is the length of the array.
 * 
 ******************************************************************************************************************/		


public class UplerQue {
	
	 public int solution(int X, int Y, int[] A) {
	        int countX = 0;
	        int countY = 0;
	        int maxPrefix = -1;

	        for (int i = 0; i < A.length; i++) 
	        {
	            if (A[i] == X) {
	                countX++;
	            }
	            if (A[i] == Y) {
	                countY++;
	            }
	            if (countX == countY) {
	                maxPrefix = i;
	            }
	        }

	        return maxPrefix;
	    }

	    public static void main(String[] args) {
	    	UplerQue sol = new UplerQue();
	        int[] A1 = {6, 42, 11, 7, 1, 42};
	        System.out.println(sol.solution(7, 42, A1)); // should return 4

	        int[] A2 = {13, 13, 1, 6};
	        System.out.println(sol.solution(6, 13, A2)); // should return -1
	    }

}
