package string.programs;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		String str="vino@#";
		System.out.println(str.length());
		String removeChar=str.replaceAll("[^a-z0-9]", "");
		System.out.println("After removing the special  string is :"+removeChar);
		System.out.println(removeChar.length());
		


	}

}
