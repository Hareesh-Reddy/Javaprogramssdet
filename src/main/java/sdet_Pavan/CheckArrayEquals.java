package sdet_Pavan;

import java.util.Arrays;

public class CheckArrayEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]={1,4,5,3,2};
		int b[]={1,4,5,3,2};
		//approach 1
		/*boolean status=Arrays.equals(a, b);
		if(status==true)
		{
			System.out.println("both arrays same");
			
		}
		else
		{
			System.out.println("both are not same");
		}*/
		
		//approach2
		boolean status=true;
		if(a.length==b.length)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=b[i])
				{
					status=false;
				}
					
			}
		}
			else
			{
				status=false;
			}
		
		if(status==true)
		{
			System.out.println("both are same");
			
		}
		else
		{
			System.out.println("both are not equal");
		}
	}

}
