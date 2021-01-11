package sdet_Pavan;

public class EvenOrOddInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 2, 4, 5, 6, 4 };

		System.out.println("even numbers");
		/*
		 * for(int i=0;i<a.length-1;i++) 
		 * { if(a[i]%2==0)
		 * System.out.println(a[i]);
		 * 
		 * 
		 * }
		 */

		for (int value : a) {
			if (value % 2 == 0)
				System.out.println(value);
		}
		System.out.println("Odd Numbers");
		for (int value : a) {
			if (value % 2 != 0)
				System.out.println(value);
		}
		/*
		 * for(int i=0;i<a.length-1;i++) { 
		 * if(a[i]%2!=0)
		 * System.out.println(a[i]);
		 * 
		 * 
		 * }
		 */

	}
}
