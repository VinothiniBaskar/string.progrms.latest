package string.programs;

public class ReverseString {

	public static void main(String[] args) {
		String str="Vino";
		String reversedString="";
		char ch;
		System.out.println("The Original string is "+str);
		for (int i = 0; i < str.length(); i++) {
			//Extracts a each character
			ch=str.charAt(i);
			//adds each character in front of the existing string
			reversedString=ch+reversedString;
			
		}
		
		System.out.println("The Reversed string is "+reversedString);

	}

}
