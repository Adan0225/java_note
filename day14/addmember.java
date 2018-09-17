class addmember
{
    public static void main(String args[])
    {
        member m = new member("abc", "dd");
        System.out.println(m.name + "," + m.user);
        m.name = "ccc";
        System.out.println("==================================");
        m.user = "ggg";
        System.out.println(m.name + "," + m.user);
    }
}