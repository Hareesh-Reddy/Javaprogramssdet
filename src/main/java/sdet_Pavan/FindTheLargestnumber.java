package sdet_Pavan;

import java.util.Scanner;

public class FindTheLargestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
	int a=sc.nextInt();
	Scanner sc1=new Scanner(System.in);
	System.out.println("enter the number");
int b=sc.nextInt();
Scanner sc2=new Scanner(System.in);
System.out.println("enter the number");
int c=sc.nextInt();
/*if(a>b && a>c)
{
	System.out.println("a is the largest:" +a);
	
}
else if(b>c && b>a)
{
	System.out.println("b is the largest number"+b);
}
else if(c>a && c>b)
{
	System.out.println("c is the largest number:" +c);
}
*/

int largestNumber=a>b?a:b;
int largestnumber1=c>largestNumber?c:largestNumber;
System.out.println(largestnumber1);
	}

}
