class ex2
{
    public static void main(String args[])
    {
        int[] x = {10, 20, 30};
        int[] y = {40, 50, 60};
        //y[3] = 100;
        System.out.println("y=" + y);

        for (int o : y) {
            System.out.println(o);
        }

        System.out.println("=============================");
        y = new int [10];
        /*
        System.out.println("x=" + x); //輸出代表位置。
        System.out.println("x[0]=" +x [0]); //代表值
        System.out.println("y=" + y);
        System.out.println("y[0]=" +y [0]);
        System.out.println("=============================");
        y[0] = x[0];
        y = x;
        System.out.println("x[0]="  +x[0]);
        System.out.println("y[0]="  +y[0]);
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("========================");
        y[0] = 100;
        System.out.println("x[0]=" + x[0]);
        System.out.println("y[0]=" + y[0]);
        System.out.println("========================");
        y=null;  //回收Array用 null
        System.out.println("y=" + y);
        //System.out.println("y=" + y[0]);  //編譯會過，但執行失敗，y[0]仍是空值。
        System.out.println("y="+y.length);  //編譯會過，但執行失敗，y.lenght
        之後仍是空值。
        /*
        for(int i=0; i<x.length; i++)
        {
        System.out.println("x["+i+"]="+x[i]);
        }
        */
        /*
        int x = 10;
        int y = 20;
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("===================");
        y=x;  //值是做copy動作
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("===================");
        */
    }
}