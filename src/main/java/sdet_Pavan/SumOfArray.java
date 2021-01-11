package sdet_Pavan;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]={6,7,8,9,4,5};
		int sum=0;
		/*for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		
			
		}
		System.out.println(sum);*/
		
		
		//enhance for loop
		for(int value :a)
		{
			sum=sum+value;
			
		}
		System.out.println(sum);
	}

}
