package sdet_Pavan;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//array should not have duplicates
		//array no need to be sorted order
		//values should be in range
		int sum=0;
		
		int a[]={1,2,4,5};
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum of elements:"+sum);
	
int sum2=0;
		for(int i=1;i<=5;i++)
		{
			sum2=sum2+i;
		}
		System.out.println("sum of elements:"+sum2);
	}
	

}
