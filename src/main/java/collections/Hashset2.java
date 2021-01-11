package collections;

import java.util.HashSet;

public class Hashset2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> evennumber=new HashSet<Integer>();
	
	evennumber.add(4);
	evennumber.add(8);
	evennumber.add(2);
	System.out.println("hashset:"+evennumber);
	HashSet<Integer> number=new HashSet<Integer>();
	number.addAll(evennumber);
	number.add(10);
	
	System.out.println(number);
	
	
	//remove all
	number.removeAll(evennumber);
	System.out.println(number);
	
	}

}
