package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap2 {
	public static void main(String[] args) { 
		Map<String , Character>m=new HashMap<String, Character>();
		m.put("dip", 's');
		m.put("jim", 'j');
		m.put(null, 'n');
		m.put(null, 'u');
		m.put("sing", null);
		m.put("ram", 'r');
		m.put("two", 't');
		m.put("jim", 'o');
		System.out.println(m);
		System.out.println("\nKeys: "+m.keySet());
		System.out.println("\nValues: "+m.values());
		Set<Entry<String, Character>> entrySet = m.entrySet();
		for (Map.Entry<String, Character> entry : entrySet) {
			String key = entry.getKey();
			Character val = entry.getValue();
			//System.out.println(key);
			System.out.println(val);
			
		}
		
		
		
	}

}
