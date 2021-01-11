package sdet_Pavan;

import java.util.Scanner;

public class CountDigitsInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int number=sc.nextInt();
		int count=0;
		while(number!=0)
		{
			number=number/10;
			count++;
		}
		System.out.println(count);
	}

}
