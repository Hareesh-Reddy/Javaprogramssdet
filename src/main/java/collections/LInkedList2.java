package collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class LInkedList2 {
	public static void main(String[] args) {
   
		
		LinkedList l=new LinkedList();
		l.add("x");
		l.add("y");
		l.add("y");
		l.add("j");
		l.add("z");
		l.add("p");
		
		LinkedList new_l=new LinkedList();
		new_l.addAll(l);
		System.out.println(new_l);
		
		//remove first collection from second collection
		new_l.removeAll(l);
		
		
		//sorting order
		
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		Collections.sort(l,Collections.reverseOrder());
		System.out.println(l);
		
		Collections.shuffle(l);
		System.out.println(l);
		
		
		
		
		
		
		
		
		
}
}