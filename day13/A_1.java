class A_1 extends B
{
    int access;

    A_1(String name, int chi, int word, int access)
    {
        super(name, chi, word);
        this.access = access;
        System.out.println("A_1小組 " + access);
    }

    A_1(String name, int chi, int access)
    {
        super(name, chi);
        this.access = access;
        System.out.println("A_1小組 " + access);
    }
}
