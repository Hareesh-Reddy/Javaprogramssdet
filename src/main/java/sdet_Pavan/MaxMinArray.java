package sdet_Pavan;

public class MaxMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		int b[]={51,20,40,10,50};
		int max=b[0];
		
		
		for(int i=0;i<b.length;i++)
		{
			if(b[i]>max);
			{
				max=b[i];
			}
			
		}
		System.out.println("Max Value:" +max);
		
		/*int min =a[0];
		for(int i=1;i<=a.length;i++)
		{
			if(a[i]<min);
			{
				min=a[i];
			}
		}
		System.out.println("Min Value:" +min);*/

	}

}
