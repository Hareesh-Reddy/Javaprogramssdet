package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//HashMap map=new HashMap();
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		//HashMap map=new HashMap();
	
		map.put(101, "e1");
		map.put(104, "e2");
		map.put(102, "e3");
		map.put(103, "e4");
		map.put(105, "e5");
		map.put(106, "e5");//duplicate value allowed
		map.put(103, "e7"); //duplicate key not allowed but exist value replace with new value
	System.out.println(map.entrySet());
	System.out.println(map);
	
	//get element
	System.out.println(map.get(105));
	
	//remove element
	System.out.println(map.remove(104));
	
	//contains method
	//key
	System.out.println(map.containsKey(102)); ///true
	System.out.println(map.containsKey(104));//false
	//value
	System.out.println(map.containsValue("marry"));//false
	System.out.println(map.containsValue("e2"));//true
	
	//is empty method
	System.out.println(map.isEmpty());//false because we have data
	
	//only keys set
	System.out.println(map.keySet());  //duplicates not allowed
	//only values collection   
	System.out.println(map.values()); //duplicates allowed
	
	
	
	
	
	
	/*for(Object i:map.keySet())
	{
		System.out.println(i);//print all keys as indivdual
	}
	for(Object i:map.values())
	{
		System.out.println(i);//print all value individual
	}
	//key and value combination
	
	for(Object i:map.keySet())
	{
		System.out.println(i+"    "+map.get(i));
	}
	//entry method  //each entry as an order
	for(Object entry:map.entrySet())
	{
		System.out.println(entry);
	}
	for(Map.Entry entry:map.entrySet())
		
		System.out.println(entry.getKey()+"   "+entry.getValue());
	}*/
	
	Set s=map.entrySet();
	Iterator i=s.iterator();
	while(i.hasNext())
	{
		Map.Entry entry=(Entry)i.next();
		System.out.println(entry);
	}
	
	
	
	

}
}