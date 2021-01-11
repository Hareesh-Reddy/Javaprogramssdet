package sdet_Pavan;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="welcome to java selenium"; //original string
		String[] temp=str.split(" "); //emoclew ot avaj muineles
		String reverseString="";
	
		/*for(String w:temp)
		{
			String revword=""; //welcome //to
			for(int i=w.length()-1;i>=0;i--)
			{
		     revword=revword+w.charAt(i); //e e+m=em emo emc //ot
		     
			}
			
			reverseString=reverseString+revword+" "; //emoclew+ot
		}
		System.out.println("reverse String:   "+reverseString);
*/
		for(String w:temp)
		{
			StringBuffer sb=new StringBuffer(w);
			sb.reverse();
			reverseString=reverseString+sb.toString()+" ";
			
		}
		System.out.println("reverse String:   "+reverseString);
		
	}
	

}
