import java.util.Scanner;

public class Token {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence and press enter");
		
		String sentence = input.nextLine();
		
		String[] tokens = sentence.split(" ");
		
		
		System.out.printf("Number of elements: %d%n The tokens are: %n", tokens.length);
		
		for(String token: tokens) { //enhanced for loop
			System.out.println(token);
		}
		

	}

}
