package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class UniqueCharactersFromGivenStringAndStoringInAnotherString {

	public static void main(String[] args) {
		
		String string = "";
	

		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

		String inputString = "aabbccdabc";
		char[] charArray = inputString.toCharArray();

		for (char c : charArray) {

			if (hashMap.containsKey(c)) {
				hashMap.put(c, hashMap.get(c)+1);
			
			} else {
				hashMap.put(c, 1);
				 string = Character.toString(c);
				 System.out.print(string+"  ");
				
			}
			
		}
	
		
	}

}
