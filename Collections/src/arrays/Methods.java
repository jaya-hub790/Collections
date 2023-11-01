package arrays;

import java.util.LinkedList;
import java.util.List;

public class Methods {
	public static void main(String[] args) {
		
		
		List<Integer> l=new LinkedList<>();
		l.add(null);
		l.add(12);
		l.add(234);
		l.add(90);
		l.add(870);
		l.add(12);
		l.add(0);
		l.add(null);
		l.add(67);
		System.out.println(l);
		System.out.println("\n Size of the List is: "+l.size());
		System.out.println("\n get the index position:"+l.get(4));
		int indexOf = l.indexOf(12);
		System.out.println("\n first InderxOf number: "+indexOf);
		System.out.println("\n Last indexOf of the number: "+l.lastIndexOf(12)); 
		//l.clear();
		boolean empty = l.isEmpty();
		System.out.println("\n is it empty the List: "+empty);
		l.add(3, null);
		System.out.println("\n new ArrayList is: "+l);
		System.out.println("\n New ArratList is: "+l.size());
		l.set(3, 200);
		System.out.println("\n updated ArrayList is: "+l);
		System.out.println("\n size is: "+l.size());
		l.remove(6);
		System.out.println(l);
		System.out.println("\n After removing index then size: "+l.size());
		boolean contains = l.contains(872);
		System.out.println("\n ArrayList contains 872: "+contains);
		System.out.println(l.indexOf(0));
		System.out.println(l.get(2));
		
		
	}

}
