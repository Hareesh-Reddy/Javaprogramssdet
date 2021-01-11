package sdet_Pavan;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class HowToReadTextData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fr=new FileReader("S:\\Notepad\\overloading.txt");
		
		/*BufferedReader br=new BufferedReader(fr);
		String str;
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		*/
Scanner s=new Scanner(fr);
while(s.hasNextLine())
{
	System.out.println(s.nextLine());
}
	}

}
