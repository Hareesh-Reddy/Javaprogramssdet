package sdet_Pavan;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		int count=1;
		for(int i=0;i<str.length()-1;i++)
		{
			if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println("number of words in the string:"+count);
		
	}

}
