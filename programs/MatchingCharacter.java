package string.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MatchingCharacter {

	public static void main(String[] args) {
		String str="vinothinivasanth";
		char[] ch=str.toCharArray();
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		System.out.println(map);
		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c,1);
			}
		}
		System.out.println(map);
		
		Set<Map.Entry<Character, Integer>> value=map.entrySet();
		
		for (Entry<Character, Integer> entry : value) {
			if (entry.getValue()>1) {
				System.out.println(entry.getKey()+" = "+entry.getValue());
			}
			
			 else if(entry.getValue()==1) {
				System.out.println(entry.getKey()+" = "+entry.getValue());

			}
		}
	}

}
