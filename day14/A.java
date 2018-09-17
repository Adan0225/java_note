class A extends student
{
    private int chi;
    A(String name, int chi)
    {
        super(name);
        this.chi = chi;
    }
    String show1()
    {
        return super.show() + "\t國文:" + chi;
    }
    void change(int chi)
    {
        this.chi = chi;
    }
}