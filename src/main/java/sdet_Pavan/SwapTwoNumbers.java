package sdet_Pavan;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=10,b=20;
		System.out.println(a+"   "+b);
		
	//method1	
		/*int t=a;
		a=b;
		b=t;
		
		System.out.println(a+"   "+b);*/
	//method2;
		
		/*a=a*b;
		b=a/b;
		a=a/b;
		System.out.println(a+"   "+b);*/
		
		//method3:
		/*a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+"   "+b);*/
		//Method4
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println(a+"   "+b);
	}

}
