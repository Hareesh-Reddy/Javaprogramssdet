package sdet_Pavan;

public class CharacterOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="java programming is more important";


int total_count=str.length();
int actual_count=str.replace("a","").length();
int count=total_count-actual_count;
System.out.println(count);

	}

}
