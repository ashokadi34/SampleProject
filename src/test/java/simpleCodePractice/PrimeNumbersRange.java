package simpleCodePractice;

public class PrimeNumbersRange {

	public static void main(String[] args) {
		
		int range =100;
		System.out.println("prime numbers upto range: "+range);		
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
				}
		}
		
	}

}
