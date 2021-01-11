package collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Hashtable<Integer,String> tab=new Hashtable<Integer,String>();
		//Hashtable tab=new Hashtable(); //default 11 lcators and load factor 0.75
		tab.put(102,"enemy");
		tab.put(104, "generic");
		tab.put(103, "Type");
		tab.put(105, "suresh1");
		tab.put(108, "enemy");
		//tab.put(null, "enemy"); //not allowed null values in hashtable eithe key or value
		//tab.put(109, null);
		System.out.println(tab);
		
		//get element
		System.out.println(tab.get(104));
		//remove element
		System.out.println(tab.remove(104));
		System.out.println(tab);
		
		System.out.println(tab.keys()); //only key values
		System.out.println(tab.values());//only values
		
		//contains method
      System.out.println(tab.contains(102)); //true
      System.out.println(tab.contains(104)); //false
      
      System.out.println(tab.contains("suresh1"));//true
      System.out.println(tab.contains("ene")); //false
      
      //is empty method
      System.out.println(tab.isEmpty()); //false
      
      //loop method we ge the key and values
      
    /*  for(Object i:tab.keySet())
      {
    	  System.out.println(i);
      }
		for(Object i:tab.values())
		{
			System.out.println(i);
		}
		for(Map.Entry entry:tab.entrySet())
		{
			System.out.println(entry.getKey()+"   "+entry.getValue());
			
			
		}
	*/	
      
      Set s=tab.entrySet();
      Iterator itr=s.iterator();
      
      while(itr.hasNext())
      {
    	 Map.Entry entry=(Entry)itr.next(); 
    	
    	 System.out.println(entry);
      }
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
