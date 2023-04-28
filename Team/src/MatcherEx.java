import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherEx {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("^[0-9]*$");
		String str = "04234234";

		Matcher matcher = pattern.matcher(str);
		System.out.println(matcher.find());
	}
}

