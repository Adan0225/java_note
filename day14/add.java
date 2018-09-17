class add
{
    public static void main(String args[])
    {
        student[] s = new student[2]; //s[0].s[1]
        s[0] = new A("abc", 85);
        s[1] = new B("def", 73);       //多種子類別的多型。

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].show());
        }

        s[0].setName("hij");
        /*
        student a=new A("abc",85);
            student b=new B("def",73);
            //A a=new A("abc",85);             //宣告物件的差別
            System.out.println(a.show());
             System.out.println(b.show());
            a.setName("MAC");
            b.setName("HIJ");
            System.out.println(a.show());
            System.out.println(b.show());
            */
        //a.change(62);                      //取決於物件類型的名字是否存在
        /*
        A a=new A("abc",85);
            B b=new B("def",73);
            System.out.println(a.show());
            System.out.println(b.show());
            System.out.println("=================");
            a.setName("MAC");
            b.setName("KFC");
            System.out.println(a.show());
            System.out.println(b.show());
            System.out.println("=================");
            a.change(62);
            b.change(92);
            System.out.println(a.show());
            System.out.println(b.show());
            System.out.println("=================");
        */
    }
}