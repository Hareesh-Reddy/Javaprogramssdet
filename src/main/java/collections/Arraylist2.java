package collections;

import java.util.ArrayList;
import java.util.Collections;

import org.apache.poi.ddf.EscherColorRef.SysIndexProcedure;

public class Arraylist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList al1=new ArrayList();
		
		al1.add("X");
		al1.add("Y");
		al1.add("Z");
		al1.add("T");
		al1.add("S");
		al1.add("R");
		System.out.println(al1);  //[X, Y, Z, T, S, R]
		
		//adding one collection in another collection
		ArrayList al2=new ArrayList();
		
		al2.add(1);
		al2.add("mantri");
		al2.addAll(al1);
		System.out.println("after collection elements:"+al2); //[1, mantri, X, Y, Z, T, S, R]
       
		
		//removing added collection
		
		al2.remove(al1);
		System.out.println("after removing :"+al2); //  [1, mantri, X, Y, Z, T, S, R]
		
		//sorted order
		System.out.println("elements in the array:"+al1); //[X, Y, Z, T, S, R]
		Collections.sort(al1);
		System.out.println("elements after sorting:"+al1); //[R, S, T, X, Y, Z]
		
		//reverse the order
		Collections.sort(al1,Collections.reverseOrder());
		System.out.println("elements in reverseorder:"+al1); //[Z, Y, X, T, S, R]
		
		
		//shuffle
		Collections.shuffle(al1);
		System.out.println("elements after shuffling:"+al1); //[X, R, S, Y, Z, T]
		
	
	}

}



