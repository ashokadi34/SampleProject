package simpleCodePractice;

public class PrimeNumbersRange {

	public static void main(String[] args) {
		
		int range =100;
		System.out.println("prime numbers upto range: "+range);	
		int cou=0; 
		for(int i=2;i<=range;i++) 
		{	
			boolean isPri=true;
			for(int j=2;j<i;j++) 
			{
				if(i%j==0) {
					isPri=false;
					break;
				}
			}
				if(isPri) {
					System.out.print(i+" ");
					cou++;	// Increment the counter if the number is prime			
				}
				
		}
			System.err.println("Total count of prime numbers: "+cou);
		
	}

}
