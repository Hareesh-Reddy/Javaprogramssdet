package sdet_Pavan;

import java.util.Scanner;

public class CountEvenAndOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int number=sc.nextInt();
		
		int even_count=0;
		int odd_count=0;
		
		while(number!=0)
		{
			int rem=number%10;
			if(number%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
			number=number/10;
			
		}
		System.out.println("even count:"  +even_count);
		System.out.println("oddcount:"   +odd_count);
	}

}
