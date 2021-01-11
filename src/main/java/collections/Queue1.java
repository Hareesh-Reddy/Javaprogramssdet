package collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		PriorityQueue q=new PriorityQueue();
		//only allowed homogenius elements allowed
	q.add("A");
		//q.add(1);
		q.add("B");
		q.add("C");
		q.add("D");
		System.out.println(q); //[A,B,C,D ]
		
		//get head element
		System.out.println(q.element()); //A        
		System.out.println(q.peek());    //A        
		
		//System.out.println(q.element()); //q is empty ith throuws nosuchelementException
		//System.out.println(q.peek()); //q is empty it will return null;
		
		
		//return remove element q.remove()  q.poll()
		
		System.out.println(q.remove()); //A   //q is empty ith throuws nosuchelementException
       // System.out.println(q.poll());  //A    //q is empty return null
	System.out.println(q);
	
	
	
	System.out.println("retrive the elements throguh while");
	Iterator itr=q.iterator();
	while(itr.hasNext())
			{
		   System.out.println(itr.next());
			}
	
	System.out.println("retrive the elements throguh forloop");
	for(Object value:q)
	{
		System.out.println(value);
	}
	}

}
