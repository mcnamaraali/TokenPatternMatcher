import java.util.Scanner;

public class ValidateInput {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println ("Please enter first name");
		String firstName = input.nextLine();
		System.out.println ("Please enter last name");
		String lastName = input.nextLine();
		
		System.out.printf("%nValidate Result: %n");
		
		if(!Validate.validateFirstName(firstName)) {
			System.out.println("Invalid first name");
		}
		else if (!Validate.validateLastName(lastName)) {
			System.out.println("Invalid last name");
		}
		else {
			System.out.println("Valid input. Thank you.");
		}

	}

}

class Validate {
	
	public static boolean validateFirstName (String firstName) {
		return firstName.matches("[A-Z][a-zA-Z]*");
	}
	
	public static boolean validateLastName (String lastName) {
		return lastName.matches("[a-zA-Z]+(['-][a-zA-Z]+)*");
	}
	
	
}
