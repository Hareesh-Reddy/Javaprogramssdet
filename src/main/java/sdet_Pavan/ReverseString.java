package sdet_Pavan;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the word ");
		
		String word=sc.next(); //python //madam
		String org_str=word;
		//Method1
		String rev="";
		
		int length=word.length();
		
		for(int i=length-1;i>=0;i--) 
		{
			rev=rev+word.charAt(i); // n o h t y p
			
		}
		System.out.println(rev); //nohtyp
		if(org_str.equals(rev))
		{
			System.out.println("palindrome String:"+org_str);
		}
		else
		{
			System.out.println("not palindrome string:"+org_str);
		}

		//Method2
		/*StringBuffer sb=new StringBuffer(word);
		sb.reverse();
		System.out.println(sb);*/
		
		
		//method3
		/*char a[]=word.toCharArray();
		for(int i=a.length-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println(rev);*/
		
		
		
	}

}
