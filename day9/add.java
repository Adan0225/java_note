class add
{
    public static void main(String args[])
    {
        school s1 = new school("abc", 77, 88);
        school s2 = new school("def", 89, 88);
        s1.show();
        s2.show();
        System.out.println("=====================================");
        //s1.change(60);
        //s2.change(76);
        /*
        System.out.println("國文加總:" + (s1.change2(60) + s2.change2(56)));
        s1.show();
        s2.show();
        */
        /*
        System.out.println("===============================");
        s1.abc("tea", 70, 80);
        s1.show();
        s2.show();
        System.out.println("===============================");
        s1.change2(76);
        s1.show();
        s2.show();
        System.out.println("===============================");
        */

        s1.chi = 50;
        //s2.change(79);
        System.out.println("國文加總:" + (s1.change(60) + s2.change(76)));
        s1.show();
        s2.show();

    }
}
