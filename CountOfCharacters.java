package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountOfCharacters {

	public static void main(String[] args) {

		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

		String inputString = "Happy New Year";
		char[] charArray = inputString.toCharArray();

		for (char c : charArray) {

			if (hashMap.containsKey(c)) {
				hashMap.put(c, hashMap.get(c)+1);
			
			} else {
				hashMap.put(c, 1);
				
			}

		}

		for (Map.Entry entry: hashMap.entrySet())

		{

			System.err.println(entry.getKey() + "  " + entry.getValue());

		}

	}

}
