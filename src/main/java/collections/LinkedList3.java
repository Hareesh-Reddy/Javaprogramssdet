package collections;

import java.util.LinkedList;

public class LinkedList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList l=new LinkedList();
		l.add("dog");
		l.add("dog");
		l.add("cat");
		l.add("rat");
		l.add("hat");
		
		
		System.out.println(l);
		
		l.addFirst("tiger");
		l.addLast("lion");
		System.out.println(l);
		System.out.println(l.getFirst()); //tiger
		System.out.println(l.getLast()); //elephant
		
		l.removeFirst();
		l.removeLast();
		System.out.println(l); //original elements
	}

}
