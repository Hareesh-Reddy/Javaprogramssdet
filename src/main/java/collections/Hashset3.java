package collections;

import java.util.HashSet;

public class Hashset3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashSet<Integer> set1=new HashSet<Integer>();
	
	set1.add(1);
	set1.add(2);
	set1.add(3);
	set1.add(4);
	set1.add(5);
	set1.add(6);
	
	System.out.println("hashset 1"+set1);
	
	
	HashSet<Integer> set2=new HashSet<Integer>();
	
	set2.add(4);
	set2.add(7);
	set2.add(9);
	set2.add(6);
	System.out.println(set2);
	
	
	
	
	
	//union
	set1.addAll(set2);

	System.out.println("Union"+set1);
	
	//intersection
	set1.retainAll(set2);
	System.out.println("intersection:"+set1);
	
	//difference
	set1.removeAll(set2);
	
	System.out.println("difference"+set1);
	//subset
	
	set1.containsAll(set2);
	System.out.println("conrian all"+set1);
	}

}
