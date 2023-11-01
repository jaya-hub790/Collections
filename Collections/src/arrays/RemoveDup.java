package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDup {
	public static void main(String[] args) {
		
	
	List<Integer> l=new ArrayList<>();
	l.add(10);
	l.add(30);
	l.add(10);
	l.add(120);
	l.add(40);
	l.add(150);
	System.out.println("List of Elements are:");
	for (Integer integer : l) {
		System.out.println("\n"+ integer);
	}
	Set<Integer>s=new LinkedHashSet<>();
	s.addAll(l);
	System.out.println("\n After duplicating: "+s);

}
}