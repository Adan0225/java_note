class ex3
{
	public static void main(String args[])
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("請輸入整數");
		
		int x=sc.nextInt();
		
		if(x>=0)
		{
			if(x%2==0)
			{
				System.out.println(x+"為正偶數");
			}
			else
			{
				System.out.println(x+"為正奇數");
			
			}
		
		
		}
		else
		{
		
			if(x%2==0)
			{
				System.out.println(x+"為負偶數");
			}
			else
			{
				System.out.println(x+"為負奇數");
			
			}
		
		}
	
	
	}



}



