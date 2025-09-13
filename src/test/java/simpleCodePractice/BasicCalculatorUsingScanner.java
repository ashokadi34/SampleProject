package simpleCodePractice;

import java.util.Scanner;

public class BasicCalculatorUsingScanner {

	public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();           
            
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = input.next().charAt(0);
        
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        double result;

        switch(operator) {
            case '+': result = num1 + num2;                
                break;
            case '-': result = num1 - num2;                
                break;
            case '*': result = num1 * num2;                
                break;
            case '/': result = num1 / num2;                
                break;
            default: System.err.println("Error: Invalid operator");
               
                return;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        
    
	}

}
