package sdet_Pavan;

import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		int a[]={1,5,4,3,8,9,2};
		System.out.println("before sorting array"+Arrays.toString(a));
		int n=a.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
					
				}
			}
		}
		System.out.println("after sorting array"+Arrays.toString(a));
	}

}
