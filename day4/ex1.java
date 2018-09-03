class ex1 {
	public static void main(String args[])

	{
		


		boolean result;
			int i = 1;
			result = 1 == 2 && ++i >= 2; //&&  flase 跳出 右邊不做
		System.out.println("result=" + result + ",i=" + i);

		


		System.out.println("=====================");
		long x1 = 10;
		int y1 = (int)x1;

		float y2 = x1;
		float y3 = 10.2f;
		long y4 = (long)y3;

		System.out.println("===================");

		int x=65;	
		int y=70;

		char xx = 'x';

		String xxx = "fsdfasdfdasfa";

		char xx2 = '\'';
		String xxx2 = "\"";
		char xx3 = '\\';
		String xxx3 = "\\";

		System.out.println(x > 60 && y > 75);
		System.out.println(x > 60 & y > 75);

		System.out.println(5 & 2);
		System.out.println(5 | 2);
		System.out.println(5 ^ 2);
		System.out.println(5 | 7);
		System.out.println(5 ^ 7);
		System.out.println(~2);
		System.out.println(~(-2));

		System.out.println(5 > 2);
		System.out.println(15>> 2);
		System.out.println(15 << 2);

	}
}