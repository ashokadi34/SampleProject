package simpleCodePractice;

import java.time.LocalDate;
import java.time.LocalTime;

public class CurrentDateAndTime {

	public static void main(String[] args) {

		
		 LocalDate d = LocalDate.now(); 
		 
		 System.out.println("Today date : "+d);
		 
		 LocalTime t = LocalTime.now();
		 
		 System.out.println("Time : "+t);

	
	}

}
