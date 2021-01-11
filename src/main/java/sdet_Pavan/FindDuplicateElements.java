package sdet_Pavan;

import java.util.HashSet;

public class FindDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[]={"java","c++","python","java"};
		boolean flag=false;
		/*for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("find the duplicate values:;"+arr[i]);
					flag=true;
					break;
}
			}
		}
		if(flag=false)
		{
			System.out.println("duplicate element not found");
		}*/
		
		HashSet<String>langs=new HashSet(); //hashset not allowed duplicate values
	//System.out.println(langs.add("java"));
	//System.out.println(langs.add("java"));
		for(String i:arr)
		{
			if(langs.add(i)==false)
			{
				System.out.println("find the duplicate values"+i);
				flag=true;
			}
		}
		if(flag){
			flag=false;
		}else
		{
			System.out.println("not found the duplicates");
			
		}
	}

}
