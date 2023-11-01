package arrays;

import java.util.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ArrayLists {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(201);
		l.add(101);
		l.add(201);
		l.add(601);
		l.add(301);
		l.add(401);
		l.add(801);
		l.add(501);
		//l.add(null);
		System.out.println("\n List of the elements: "+l);
		List<Integer> l1=new ArrayList<>();
		l1.add(201);
		l1.add(101);
		l1.add(501);
		//l.add(null);
		System.out.println("\n List of the elements: "+l1);
		
		l.removeAll(l1);
		System.out.println("\n After removing arrayList "+l);
		/*Set<Integer>s=new HashSet <>();
		s.add(301);
		s.add(243);
		s.add(201);
		s.add(111);
		s.add(401);
		s.add(701);
		s.add(801);
		s.add(243);
		//s.add(null);
		System.out.println("\n Set of Elements"+s);
		
		
		//l.retainAll(s);
		//System.out.println("\n update List of RetainAll elements: "+l);
		
		//s.retainAll(l);
		//System.out.println("\n update Set of  RetainAll elements: "+s);
		
		l.removeAll(s);
		System.out.println("\n After removing List elements: "+l);
		s.removeAll(l);
		System.out.println("\n After removing set elements: "+s);
		//l.removeAll(l);
		//System.out.println("After removing List elements: "+l);
		l.addAll(s);
		System.out.println("\n After addding List: "+l);
		s.addAll(l);
		System.out.println("\n After adding Set: "+s);*/
		
		
	}
	

}
