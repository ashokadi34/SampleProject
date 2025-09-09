package simpleCodePractice;

public class SumOfIntInArray {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5};
		System.out.println("Given Array: "+(java.util.Arrays.toString(arr)));
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		
		System.out.println("Sum of Integers in Array: "+sum);
	
	}

}
