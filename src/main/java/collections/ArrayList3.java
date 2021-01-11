package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String arr[]={"hello","abc","xyz"};
		for(String a:arr)
		{
			System.out.println(a);
		}
		
		
		ArrayList al=new ArrayList(Arrays.asList(arr));
		System.out.println(al);
	}

}
