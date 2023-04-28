import java.util.regex.Pattern;

public class PatternEx {
	public static void main(String[] args) {
		String pattern = "^[0-9]*$"; // 숫자만 등장하는지
		String str = "123321"; 

		boolean result = Pattern.matches(pattern, str);
		System.out.println(result); // true

	}
}


