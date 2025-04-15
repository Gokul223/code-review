package job.guarantee.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class CharCountUsingMap {

	public static void main(String[] args) {
		//testleaf
		
		// key as null accept by HashMap, LinkedHashMap. 
		// value as null accept by HashMap, LinkedHashMap, TreeMap
		// Hashtable and ConcurrentHashMap will not accept both key and value as null , eg: put(null, 1)  or put(1, null)
		// Hashtable and ConcurrentHashMap are thread safe
		String input = "testleaf";
		Map<Character,Integer> 	characterCount = new ConcurrentHashMap<Character, Integer>();
		
		for (int i = 0; i < input.length(); i++) {
			int count = characterCount.getOrDefault(input.charAt(i), 0);
			count = count +1;
			characterCount.put(input.charAt(i),count );
		}
	
		System.out.println(characterCount);
		
		Set<Entry<Character, Integer>> entrySet = characterCount.entrySet();
		
		for (Entry<Character, Integer> entry : entrySet) {
//			System.out.println("a count is 1");
			System.out.println(entry.getKey()+" count is "+entry.getValue());
		}
		
	}

}
