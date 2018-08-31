class ex5
{
    public static void main(String args[])

    {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int lcd, ram, mouse, sum; //定義

        System.out.println("請輸入LCD數量:");
        lcd = sc.nextInt();

        System.out.println("請輸入Ram數量:");
        ram = sc.nextInt();


        System.out.println("請輸入Mouse數量:");
        mouse = sc.nextInt();

        sum = lcd * 4999 + ram * 1280 + mouse * 750;




        System.out.println("訂單細目為:" +
                           "\n lcd: " + lcd +
                           "\n ram:" + ram +
                           "\n mouse:" + mouse +
                           "\n 總共：" + sum + "元");
    }
}