package collections;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashSet hs=new HashSet(); //default 16 locations
		System.out.println(hs);
		
		//HashSet<Integer> hs=new HashSet<Integer>();
       //HashSet<Strings> hs=new HashSet<Strings>();
	//	HashSet hs=new HashSet(100);
		//HashSet hs=new HashSet(100,(float) 0.95); //fill ratio customized
		
		
		hs.add("welocome");
		hs.add("reddy");
		hs.add("alone");
		hs.add(null);
		hs.add(15);
		hs.add(0.96);
		
		System.out.println(hs);
		
		//remove
		hs.remove(null);
		//contains
		System.out.println(hs.contains("alone"));
		System.out.println(hs.contains(5));
		
		//isempty()
		System.out.println(hs.isEmpty());
		
		//get the elements through eachloop
		for(Object Value:hs)
		{
			System.out.println(Value);
		}
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
