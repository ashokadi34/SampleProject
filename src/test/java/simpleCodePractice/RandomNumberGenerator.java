package simpleCodePractice;

import java.util.Random;

public class RandomNumberGenerator {

	public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = 100000 + random.nextInt(900000);
        System.out.println("Random 6-digit number: " + randomNumber);
    
	}

}
