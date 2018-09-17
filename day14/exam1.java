import java.util.Scanner;
import java.util.InputMismatchException;
class exam1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int[] x = new int[5];

		System.out.println("請輸入索引碼");


		try {
			int n = sc.nextInt(); //new InputMismatchException();
			x[n] = 100; //new  ArrayIndexOutOfBoundsException();

			//int y=50/n;


			System.out.println("x[" + n + "]=" + x[n]);

			for (int i = 0; i < x.length; i++) {

				System.out.println("hello");
			}

		}
		//catch(ArrayIndexOutOfBoundsException|InputMismatchException e)  //I 或  ;不能有繼承關係




		catch (ArrayIndexOutOfBoundsException e) { //=new  ArrayIndexOutOfBoundsException();
			System.out.println("索引範圍須介於0~4");
		} catch (InputMismatchException e) {
			System.out.println("索引需大於等0的整數");

		}


		catch (Exception e) //有繼承關係，super 擺最後

		{
			System.out.println("索引範圍須介於0~4或索引需大於等0的整數");
		}



	}


}