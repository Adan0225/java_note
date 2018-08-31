class ex1
{
    public static void main(String args[])
    {

        int Chinese = 75;
        //Chinese=Chinese+10;
        Chinese += 10;

        System.out.println("Chinese=" + Chinese);

        //Chinese=Chinese-10;
        Chinese -= 10;
        System.out.println("chinese=" + Chinese);


        //Chinese=Chinese*10;
        Chinese *= 10;
        System.out.println("chinese=" + Chinese);


        //Chinese=Chinese/10;
        Chinese /= 10;
        System.out.println("chinese=" + Chinese);


        //Chinese=Chinese%3;
        Chinese %= 3;
        System.out.println("chinese=" + Chinese);

        /*  int x=10;
            x=x+10;   //右邊的結果 等左邊（堆疊特性）


            System.out.println("x="+x);
        */
        //int y=20;
        //x+2*y=3*y+20;
        //x=2*y+20;  //左邊只能放變數
        //y=2*x+50;   // = 指定（assign)






        /*
        int x=10;
        int y=3;

        System.out.println("10+20="+(10+20));

        System.out.println("x+y="+(x+y));
        System.out.println("x-y="+(x-y));
        System.out.println("x*y="+(x*y));
        System.out.println("x/y="+((float)x/y)); // float 先計算
        System.out.println("x%y="+(x%y));
        */

    }

}

