class add2
{
    public static void main(String args[])
    {
        /*
        int abc = 32;
        int def = 75;
        int xx = 65;
        //有索引碼資料做排列，相同類型，名稱統一
        */
        /*
        int[] x = new int[3];                  //= assign , 只有有new 一定有stack and heap
        x[0]=32;
        x[1]=75;
        x[2]=65;
        //靜態初始值建立方式 --〉new
        */
        int[] x = {10, 20, 30}; //{}也可以實體化，但只做到stack, no heap,輸入值後產生heap
        //double [] x = new double[3];
        //String  [] x = new String[3];
        //boolean[] x = new boolean[3];
        System.out.println(x);
        System.out.println(x[1]);
        /*
        for (int i = 0; i < 2; i++) {
            System.out.println("x[" + i + "]=" + x[i]);
        }
        System.out.println("=================================================");
        for (int o : x) { //for_each 從頭抓到尾
            System.out.println(o);
        }
          */
    }
}
