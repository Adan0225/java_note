class add2
{
    public static void main(String args[])
    {
        student[][] s = new student [2][]; //靜態初始化
        s[0] = new student[3];
        s[1] = new student[4];
        s[0][0] = new A("a1", 70);
        s[0][1] = new A("a2", 70);
        s[0][2] = new A("a3", 70);
        s[1][0] = new B("b1", 80);
        s[1][1] = new B("b2", 80);
        s[1][2] = new B("b3", 80);
        s[1][3] = new B("b4", 80);

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                System.out.println("s[" + i + "][" + j + "]=" + s[i][j] + "\t" +
                                   s[i][j].show());
            }
        }

        System.out.println("==========================================");
        s[0][0].setName("bbb");
        System.out.println("s[" + 0 + "][" + 0 + "]=" + s[0][0] + "\t" +
                           s[0][0].show());
        System.out.println("==========================================");
        s[0][0].change(86);
        System.out.println("s[" + 0 + "][" + 0 + "]=" + s[0][0] + "\t" +
                           s[0][0].show());
        System.out.println(s[0][1] instanceof
                           student);  //insanceof 查詢is-a 跟這個 class是否有關係
        System.out.println(s[0][1] instanceof A);
        System.out.println(s[1][0] instanceof A);
        System.out.println(s[1][0] instanceof student);
        System.out.println(s[1][0] instanceof B);
        System.out.println(s[1][0] instanceof A);
        System.out.println(
            s[0][2].getClass());  //getClass 查詢用那一個class new 出來
        System.out.println("=============================================");
        System.out.println(s[1][1].equals(s[0][1]));
        System.out.println(s[1][1]);
        System.out.println(s[0][1]);
        System.out.println("==================");
        s[1][1] = s[0][1];
        System.out.println(s[1][1].equals(s[0][1]));
        System.out.println(s[1][1]);
        System.out.println(s[0][1]);
    }
}