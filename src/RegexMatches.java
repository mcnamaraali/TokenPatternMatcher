import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

	public static void main(String[] args) {
		Pattern expression = Pattern.compile ("J.*\\d[0-35-9]");
		
		String birthdays = "Jane's birthday is 05-12-75\n" + 
		"Dave's birthday is 01-02-95";
		
		Matcher matcher = expression.matcher(birthdays);
		
		while(matcher.find()) {
			System.out.println(matcher.group());
		}

	}

}
