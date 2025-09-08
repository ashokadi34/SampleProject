package simpleCodePractice;

public class CountOfDuplicateIntInArray {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5,2,2};
		int in = 2;
		int cou=0;
		
		for(int i : arr)
		{
			if(in==i)
			{
				cou++;
			}
		}
		System.out.println("duplicateIntCountArray: "+cou);
	
	}

}
