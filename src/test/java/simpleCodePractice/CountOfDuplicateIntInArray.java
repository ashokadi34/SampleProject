package simpleCodePractice;

public class CountOfDuplicateIntInArray {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5,2,2};
		System.out.println("Given Array: "+(java.util.Arrays.toString(arr)));
		int in = 2;
		System.out.println("Duplicate Int in Array(input): "+in);
		int cou=0;
		
		for(int i : arr)
		{
			if(in==i)
			{
				cou++;
			}
		}
		System.out.println("Count of Duplicate Int In Array: "+cou);
	
	}

}
