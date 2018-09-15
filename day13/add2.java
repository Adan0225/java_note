class add2
{
    public static void main(String args[])
    {
        SA s1 = new SA("a", 74);
        SB s2 = new SB("b", 85);
        /*s1.skill();
        s2.skill();
        */
        System.out.println(s1.show());
        System.out.println(s2.show());
        System.out.println("=======================");
        s2.change(87);
        System.out.println(s1.show());
        System.out.println(s2.show());


    }
}