package sdet_Pavan;

public class LinearValueSerachInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int a[]={14,15,16,17,18};
		int src_int =20;
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(src_int==a[i])
			{
				System.out.println("search value:"+i);
				flag=true;
				break;
				
			}
		}

		if(flag){
			
			flag=true;
		}
		else 
		{
			System.out.println("search value not found");
		}
			
	}

}
