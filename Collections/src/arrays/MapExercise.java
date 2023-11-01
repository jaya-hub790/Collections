package arrays;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExercise {
	public static void main(String[] args) {
		Map<Integer, String>m=new HashMap<>();
		m.put(1, "java");
		m.put(null, null);
		m.put(2, "c#");
		m.put(3, "pascal");
		m.put(4, "cobol");
		m.put(null, "c#");
		m.put(2, "eclipse");
		System.out.println(" Map elements are: \n"+m);
		//list if entries
		System.out.println("\nEntries if Map is________");
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		for (Entry<Integer, String> entry : entrySet)
		{
			System.out.println(entry);
		}
		
		System.out.println("\n________________");
		String string = m.get(2);
		System.out.println("value of 2 is: "+string );
		//hashcode
		System.out.println("\nHashcode is________________");
		int hashCode = m.hashCode();
		System.out.println(hashCode);
		//list of keys
		System.out.println("\n list of keys --------");
		Set<Integer> keySet = m.keySet();
		for (Integer integer : keySet)
		{
			System.out.println(integer);
		}
		//list of values are
		System.out.println("\n list of values---------");
		Collection<String> values = m.values();
		for (String string2 : values) {
			System.out.println(string2);
		}
		System.out.println("\n size of MAP");
		int size = m.size();
		System.out.println(size);
		
			
		}
	}


