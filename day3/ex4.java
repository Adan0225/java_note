class ex4
{
    public static void main(String args[])

    {

        java.util.Scanner sc = new java.util.Scanner(System.in);




        System.out.println("請輸入國文分數:");
        int chi = sc.nextInt();

        System.out.println("請輸入英文分數:");
        int eng = sc.nextInt();


        int sum = chi + eng;
        double ave = sum / 2;



        System.out.println("你的成績為" +
                           "\n國文 " + chi +
                           "\n英文:" + eng +
                           "\n總分:" + sum +
                           "\n平均:" + ave);

        /*System.out.println("請輸入一個整數");

        int x;

        x=sc.nextInt();

        System.out.println("你輸入的是:"+x);
        */




    }
}