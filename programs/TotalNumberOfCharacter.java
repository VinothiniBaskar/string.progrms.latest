package string.programs;

public class TotalNumberOfCharacter {

	public static void main(String[] args) {
		String str = "Vinothini is queen";
		System.out.println("The length of string is :" + str.length());
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				count++;
			}

		}

		System.out.println("The total number of characters in a string is :" + count);
	}

}
