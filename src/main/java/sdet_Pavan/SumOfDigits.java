package sdet_Pavan;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
int number=sc.nextInt();

int sum=0;
while(number!=0)
{
	sum=sum+number%10;
	number=number/10;
	
}
System.out.println(sum);
	}

}
