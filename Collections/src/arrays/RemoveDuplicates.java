package arrays;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Vector;

public class RemoveDuplicates {
	public static void main(String[] args) {
		//int integer=0;
		Set<Integer>  s=new LinkedHashSet<>();
		s.add(10);
		s.add(10);
		s.add(20);
		s.add(50);
		s.add(60);
		s.add(80);
		s.add(60);
		s.add(50);
		
		System.out.println("Total is: "+s); 
		
		for (Integer integer : s) {
			System.out.println(integer);
			}
		
		List<Integer>l=new Vector<>();
		
		l.add(105);
		l.add(805);
		l.add(205);
		l.add(505);
		l.add(605);
		l.add(100);
		l.add(606);
		l.add(505);
		System.out.println("\n List of elements:"+l);
		l.add(2, 62);
		l.set(5, 43);
		for (int i = 0; i < l.size(); i++) 
		{
			
		}
		System.out.println("\n New list of the array is: "+l);
		System.out.println("\n fourth position of List is: "+l.get(4));
		System.out.println("\n index position of 80 is: "+l.indexOf(80));
		boolean contains = l.contains(70);
		
		System.out.println("\n is value of 70 present: "+contains);
		
		System.out.println("\n LastIndex of List : "+l.lastIndexOf(10));
		System.out.println("\n length of the list is: "+l.size());
		
		
	}

}
