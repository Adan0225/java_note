class ex11
{
	public static void main(String args[])
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("會員等級:"+
		"\nlevel_1)VIP"+
		"\nlevel_2)金卡"+
		"\nlevel_3)銀卡"+
		"\nlevel_4)普通");
		
		
		//int member=sc.nextInt();
		
		//char member='丁';
		String member=sc.next();
		
		switch(member)
		{
			//case 1:
			//case '甲':
			case "level_1":
				System.out.println("VIP");
				break;
			//case 2:
			//case '乙':
			case "level_2":
				System.out.println("金卡");
				break;
			//case 3:
			//case '丙':
			case "level_3":
				System.out.println("銀卡");
				break;
			//case 4:
			//case '丁':
			case "level_4":
				System.out.println("普通");
				break;
			default:
				System.out.println("限定1~4");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//System.out.println("巨匠");
		
		
		//int x=55;
		
		//System.out.println(x>=60? "及格" :"不及格");
		
		/*if(x>=60)
		{
				System.out.println("及格");
		}
		else
		{
				System.out.println("不及格");
		}*/
	
	}


}