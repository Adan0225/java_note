class s2
{
	public static void main(String args[])
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);

		System.out.println("請輸入國文分數:");
		int chi=sc.nextInt();
		System.out.println("請輸入英文分數:");
		int eng=sc.nextInt();
		System.out.println("請輸入數學分數:");
		int mat=sc.nextInt();

		int sum = chi+eng+mat;
		double ave=sum/3;
		System.out.println("你的總成績:");
		System.out.println("\n 國文:"+chi);
		System.out.println("\n 英文:"+eng);
		System.out.println("\n 數學:"+mat);
		System.out.println("\n 總分:"+sum);
		System.out.println("\n 平均:"+ave);

	}
}