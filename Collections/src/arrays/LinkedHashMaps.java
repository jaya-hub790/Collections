package arrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMaps {
	public static void main(String[] args) {
		
	Map<Integer, String> m=new LinkedHashMap<Integer, String>();
	m.put(1, null);
	m.put(5, "buscuits");
	m.put(4, "jam");
	m.put(3, "wig");
	m.put(null, null);
	m.put(3, "sql");
	m.put(null, "wig");
	m.put(2, "jam");
	System.out.println("\n Map is: "+m);
	System.out.println("\n Keys on the Map: "+m.keySet());
	System.out.println("\n Values on the Map: "+m.values());
	String valueKey = m.get(3);
	System.err.println("Specific key value: "+valueKey);
	
	Set<Entry<Integer, String>> entrySet = m.entrySet();
	for (Entry<Integer, String> entry : entrySet) {
		System.out.println("\n "+entry);
		//System.out.println("\n "+entry.getKey());
	}
	
	
	}
		
	}


