package sdet_Pavan;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="java program is no    more   future";
		System.out.println("before removing spaces:"+str);
		str=str.replaceAll("\\s","");
		
		System.out.println("after removing spaces:"+str);

	}

}
