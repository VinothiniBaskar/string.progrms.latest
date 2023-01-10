package string.programs;

import java.util.HashMap;

public class MatchingCharacterTwoStrings {

	public static void main(String[] args) {
		String str="Vino";
		String str1="Viso";
		
		
		char[] arr=str.toCharArray();
		char[] arr1=str1.toCharArray();
		
		HashMap<Character,Integer> hmap=new HashMap<Character,Integer>();
		HashMap<Character,Integer> hmap1=new HashMap<Character,Integer>();
		
		for (char c : arr) {
			if (!hmap.containsKey(c)) {
				hmap.put(c, 1);
			}
		}

		
		for (char c1 : arr1) {
			if (hmap.containsKey(c1)) {
				hmap1.put(c1, 1);
			}
		}

System.out.println("The Matching characters are :"+hmap1);
System.out.println("The number of matching characters are :"+hmap1.size());
	}

}


	
