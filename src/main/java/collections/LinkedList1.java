package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//decalre methods
	//LinkedList<String> l=new LinkedList<String>();
		//LinkedList<Integer> l=new LinkedList<Integer>();
		
		LinkedList l=new LinkedList();
		l.add(5);
		l.add("Rama");
		l.add(15.4);
		l.add("seetha");
		l.add(null);
		l.add("one");
		
		System.out.println(l); //[5, Rama, 15.4, seetha, null, one]
		
				
		
		//remove element
		l.remove(3);
		l.remove(15.4);
		System.out.println(l);  //[5, Rama, null, one]
	
	//add elements through index
        l.add(3, "seetha");
        l.add(2,15.4);
        System.out.println(l); //[5, Rama, 15.4, seetha, null, one]

	//retrive the element
       System.out.println(l.get(1));//rama
       
       //replace the element
       l.set(1,"venkateshwara");
       System.out.println(l);//[5, venkateshwara, 15.4, null, seetha, one]
       
       //contains
       System.out.println(l.contains("seetha")); //true
       System.out.println(l.contains(15));  //false
    System.out.println("retrive the elements forloop");   
	for(int i=0;i<l.size();i++)
	{
		System.out.println(l.get(i));
	}
	for(Object w:l)
	{
		System.out.println(w);
	}
	
	Iterator i=l.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	}
	

}
