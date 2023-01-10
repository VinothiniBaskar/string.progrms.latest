package string.programs;

import java.util.HashMap;

public class FirstNonRepeatingCharcter {

	public static void main(String[] args) {
		String str="aabbcgcf";
		
		//Declare hashmap with key value pair 
		//character  and frequency is count
		HashMap<Character,Integer> hmap=new HashMap<Character,Integer>();
		
		//Iterate through for loop
		for (int i = 0; i < str.length(); i++) {
			//compare each character in string and store it currentchar variable
			Character currentChar=str.charAt(i);
			//compare if currenchar does not repeating and put it to currentchar and increament by1
			if (hmap.containsKey(currentChar)==false) {
				hmap.put(currentChar,1);
			}
			else {
				//declare a frequency and get the currentchar
				int currentFreq=hmap.get(currentChar);
				//If repeating increase the frequency 
				currentFreq++;
				//put the currentchar and currentFreq
				hmap.put(currentChar, currentFreq);
			}
		}
		//Declare a boolean as false
        boolean nonRepeatingFound=false;
        //Declare for loop for checking first to last
		for (int i = 0; i < str.length(); i++) {
			Character currentChar=str.charAt(i);
			int currentFreq=hmap.get(currentChar);
			//If currentFreq character is 1 
			if (currentFreq==1) {
				//print the character
				System.out.println(currentChar);
				//it is true 
				nonRepeatingFound=true;
				//break
				break;
			}
			
		}
		if (nonRepeatingFound==false) {
			System.out.println(-1);
		}
	}

}
