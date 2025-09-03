package simpleCodePractice;

public class FibonacciSeries {

	public static void main(String[] args) {

		int febCount=15;
		System.out.println("Fibonacci count: "+febCount);
		int[] feb=new int[febCount];
		feb[0]=0;
		feb[1]=1;
		for(int i=2;i<feb.length;i++) {
			feb[i]=feb[i-1]+feb[i-2];
		}
		for(int i=0;i<feb.length;i++) {
			System.out.print(feb[i]+" ");
		}
	
	}

}
