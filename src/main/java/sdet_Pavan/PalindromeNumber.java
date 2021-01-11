package sdet_Pavan;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int number=sc.nextInt();
		int org_num=number;
	
		int rev=0;
		while(number!=0)
		{
			rev=rev*10+number%10;
			number=number/10;
			
		}
		System.out.println(rev);
		if(org_num==rev)
		{
			System.out.println("palindrome number:"  +org_num);
		}
		else
		{
			System.out.println("not palindrome1 Number:"  +org_num);
		}
			
		

/*	StringBuffer rev;
	StringBuffer sb=new StringBuffer(String.valueOf(number));
	rev=sb.reverse();
	System.out.println(rev);
*/
	}

}
