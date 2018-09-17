class B extends student
{
    private int eng;
    B(String name, int eng)
    {
        super(name);
        this.eng = eng;
    }
    String show()
    {
        return super.show() + "\t英文:" + eng;
    }
    void change(int eng)
    {
        this.eng = eng;
    }
}