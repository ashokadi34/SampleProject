package simpleCodePractice;

public class ArmStrongNumber {

	public static void main(String[] args) {

		int num=153;	//1*1*1 + 5*5*5 + 3*3*3=153
		System.out.println("Given number: "+num);
		int orgNum=num;
		int res=0;
		int numLength=String.valueOf(num).length();
		
		while(num!=0) 
		{
			int r=num%10;
			res=(int) (res+Math.pow(r, numLength));
			num=num/10;			
		}
			if(res==orgNum) {
				System.out.println(orgNum+" armStrongNumber");
			} else {
				System.out.println(orgNum+" not armStrongNumber");
			}
	
	}

}
