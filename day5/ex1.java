class ex1 {
	public static void main(String args[])

	{


		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("會員等級:" +
		                   "\nlevel_1)VIP" +
		                   "\nlevel_2)金卡" +
		                   "\nlevel_3)銀卡" +
		                   "\nlevel_4)一般");
		
		// int member=sc.nextInt();
        String member=sc.next();
		switch (member)  //switch() 僅能輸入變數
		 {    
		
		//case 1:
			case "level_1":
			System.out.println("VIP");
			break;

		//case 2:
			case "level_2":
			System.out.println("金卡");
			break;

		//case 3:
			case "level_3":
			System.out.println("銀卡");
			break;
		//case 4:
			case "level_4":
			System.out.println("一般");
			break;
		default:
			System.out.println("限定輸入1～4");





/*

    int member=sc.nextInt();



			 int x =55;

			System.out.println(x>=60?"及格":"不及格");

			//三元運算子

			 if(x>=60)
			 {
			 	System.out.println("及格");
			}
			else
			{
				System.out.println("不及格");
			}

		
*/

		}
	}
}