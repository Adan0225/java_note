class ex3
{
    public static void main(String args[])
    {
        /*
        int [] chi = {75, 85, 96};
        int [] eng= {77, 80, 65};*/
        //int [][] x=new int [3][4];   //幾個中括號就幾個階段分組 ，3組每組有4個
        /* int [][] x={
                       {10,65},
                       {85,78,98,41},   //不等長，動態寫法
                       {41,52,63}
                   };    //左邊幾層中括號, 右邊就幾層大括號
         */
        int [][] x = new int[3][];
        x[0] = new int[2];
        x[1] = new int[4];
        x[2] = new int[3];
        System.out.println(x);
        System.out.println(x.length); //.length只能查一層
        System.out.println(x[0]);
        //System.out.println(x[0][0].length); //.length 前面必需是位置
        System.out.println(x[1]);

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.println("x[" + i + "][" + j + "]=" + x[i][j]);
                //System.out.println("x["+i+"]["+j+"]="+x[i][j]);
            }

            System.out.println();
        }
    }
}
