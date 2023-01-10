package string.programs;

public class Palindrome {

	public static void main(String[] args) {
		String str="peek";
		char  ch;
		String reverseString="";
		for (int i = 0; i < str.length(); i++) {
			ch=str.charAt(i);
			reverseString=ch+reverseString;		
		}
		System.out.println(reverseString);

		if (str.equals(reverseString)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println(" Not Palindrome");

		}

	}

}
