package simpleCodePractice;

public class NumbFormatPadding {

	public static void main(String[] args) {

		String input = "324001212";
		String formattedOutput = String.format("%013d", Long.parseLong(input));	//**
		System.out.println("numbFormatPadding: " + formattedOutput);
	
	}

}
