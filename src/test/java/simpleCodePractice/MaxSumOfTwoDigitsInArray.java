package simpleCodePractice;

public class MaxSumOfTwoDigitsInArray {

	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5,6};
		System.out.println("Given Array: "+(java.util.Arrays.toString(arr)));
		int max=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				int output=arr[i]+arr[j];
				if(output>max)
				{
					max=output;
				}
			}
		}
		System.out.println("MaxSumOfTwoDigitsInArray: "+max);
	
	}

}
