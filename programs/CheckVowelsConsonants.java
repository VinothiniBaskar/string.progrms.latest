package string.programs;

public class CheckVowelsConsonants {

	public static void main(String[] args) {
		String str="vinothini";
		char[] ch=str.toCharArray();
		int vowelCount=0;
		int consonantCount=0;
		
		for (int i = 0; i < str.length(); i++) {
			if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				vowelCount++;
			}
			else {
				consonantCount++;
			}
		}
System.out.println("The vowels count is :"+vowelCount);
System.out.println("The consonant count is :"+consonantCount);

	}

}
