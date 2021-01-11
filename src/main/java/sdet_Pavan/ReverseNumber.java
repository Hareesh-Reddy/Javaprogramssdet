package sdet_Pavan;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number"); //123456
		int number=sc.nextInt();
		//int act_number=number;
	
	int rev=0;
		while(number!=0)
		{
			rev=rev*10+number%10; //0*10+123456%10 =0+6 =6  6 5 4 3 2 1
			number=number/10; //123456/10=12345  1234 123 12 1 
			
		}
		System.out.println(rev);
		

	/*StringBuffer rev;
	StringBuffer sb=new StringBuffer(String.valueOf(number));
	rev=sb.reverse();
	System.out.println(rev);*/
	
	}

}
