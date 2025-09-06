package simpleCodePractice;

public class FindMissingDigitArray {

	public static void main(String[] args) {

		int arr[]= {1,2,4,5};
		int n=arr.length+1;
		int exSum=n*(n+1)/2;
		int acSum=0;
		int res=0;
		
		for(int i=0;i<arr.length;i++)
		{
			acSum=acSum+arr[i];
		}
			res=exSum-acSum;
			System.out.println("missingDigitArray: "+res);				
	
	}

}
