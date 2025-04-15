package job.guarantee.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LearnMap {
// in map the values are stored based on key, 
	
	public static void main(String[] args) {
		
		Map<String, String> hashMapImplementation = new HashMap<String, String>();
		
		hashMapImplementation.put("name", "Vikas");
		hashMapImplementation.put("Name", "Vikas");
		hashMapImplementation.put(null, "the key will be null");
		
		System.out.println(hashMapImplementation.size());
				
		System.out.println(hashMapImplementation.get(null));
		
		System.out.println(hashMapImplementation.containsKey("Name"));
		
		System.out.println(hashMapImplementation.containsValue("Gokul"));
		
		
		System.out.println(hashMapImplementation);
	
		
		Map<String, Integer> linkedHashMapImplementation = new LinkedHashMap<String, Integer>();
		
		linkedHashMapImplementation.put("hello", linkedHashMapImplementation.getOrDefault("hello", 10));
		
		System.out.println(linkedHashMapImplementation.get("hello"));
		
		linkedHashMapImplementation.put("hello", linkedHashMapImplementation.getOrDefault("hello", 15));
		
		System.out.println(linkedHashMapImplementation.get("hello"));
		
		
		
		
	}
	
}
