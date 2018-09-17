class ex1
{
    public static void main(String args[])
    {
        int x = 10;
        int y = 10;
        System.out.println(x == y);
        //System.out.println(x.equals(y));
        System.out.println("=========================================");
        /*
        Integer x2 =10;
        Integer y2 =10;
        Integer x2 = new Integer(10);
        Integer y2 = new Integer(10);
        */
        String x1 = "abc";
        String y1 = "abc";
        String x2 = new String(x1);
        String y2 = new String(x1);
        System.out.println(x2);
        System.out.println(y2);
        //System.out.println(x2);
        //System.out.println(y2);
        System.out.println(x2 == y2); // ==2個物件  個別new 用address去判斷
        System.out.println(x2.equals(y2));   //equals 用value值去判斷
        System.out.println("=========================================");
    }
}