package string.programs;

public class CalculateLengthOfStringWithoutDigit {

	public static void main(String[] args) {
		String str="Test45";
		String removeDigit=str.replaceAll("\\d", "");
		System.out.println(removeDigit);

	}

}
