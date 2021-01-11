package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;



public class Arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//insertion order must be preserverd
		//duplicates are not allowed
		//underlying data structure available
		//growable nature of arrays
		//null insertion is possible
		//homogenoius and heterogenius values available
		
	//arraylist	String
		ArrayList<String> list=new ArrayList<String>();  
		list.add("ravi");
		list.add("suresh");
		list.add("ramesh");
		list.add(null);
		list.add(2,"before 2nd");
		list.add(0,"before 0");
		//Collections.sort(list);
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		for(String a:list)
			
		{
			System.out.println(a);
		}
		
		//arraylist sample
		System.out.println("hetorogenius Elements");
		ArrayList  al=new ArrayList();
		al.add(199);
		al.add("wrong");
		al.add(13.5);
		al.add("A");
		al.add(true);
		System.out.println("total list of elements"+al); //[199, wrong, 13.5, A, true]
		
		//size()
		System.out.println("elements size:  "  +al.size()); //5
		
		//remove
		//al.remove("wrong");
		al.remove(1);
		System.out.println(al); //[199, 13.5, A, true]
		
		//insert a new element
		//add(index,object)
		al.add(2,"python");
		al.add("java");
		System.out.println(al);  //[199, 13.5, python, A, true, java]
		
		//retrive Element
		System.out.println(al.get(2));   //python
		
		//Replace Existing Element
		al.set(3, "ruby");
		System.out.println("after replacement:" +al);  //[199, 13.5, python, ruby, true, java]
		
		//contains method retuen true/false
		
		System.out.println(al.contains("ruby")); //true;
		
		System.out.println(al.contains("sap"));   //false
		
		
		System.out.println("reading from elements through loop");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("reading from elements trough each loop");
		for(Object a:al)
		{
			System.out.println(a);
		}
		System.out.println("reading from elements through while loop");
		Iterator itr1=al.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		
		//Linkedlist
		
		/*LinkedList<String> LList=new LinkedList<String>();
		LList.add("abc");
		LList.add(null);
		LList.add("janam");
		LList.add("mangal");
		LList.add("enemy");
		Iterator<String> itr=LList.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}*/
		//VectorList
		
/*		Vector<String> v=new Vector<String>();
		v.add("abc");
		v.add("bcd");
		v.add("cde");
		v.add("def");
		Iterator<String> itr1=v.iterator();
		while(itr1.hasNext())
		{
		System.out.println(itr1.next());
		}*/
		//stack
		/*Stack<String> stack=new Stack<String>();
		
		stack.push("enemy");
		stack.push("enemy2");
		stack.push("enemy3");
		stack.push("enemy4");
		//stack.pop();
		
		ListIterator itr2=stack.listIterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}*/
		
		
	}
	
	

}
