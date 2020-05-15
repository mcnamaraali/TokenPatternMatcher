
public class RegexSubstitution {

	public static void main(String[] args) {
		String firstString = "This sentence ends in 5 stars *****";
		String secondString = "1,2,3,4,5,6,7,8";
		
		System.out.printf("Original string %s%n", firstString);
		
		firstString = firstString.replaceAll("\\*", "^");
				//regex and then replacement overload method for replaceAll 
		
		System.out.printf("replacement string %s%n", firstString);
		
		firstString = firstString.replaceAll("stars", "carets");
		
		System.out.printf("replacement string %s%n", firstString);
		
		System.out.printf("Original secondString  %s%n", secondString);
		
		for (int i = 0; i < 3; i++) {
			secondString = secondString.replaceFirst("\\d", "digit");
		}
		
		System.out.printf("%nreplacement secondString  %s%n", secondString);

	}

}
