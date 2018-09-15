class SB extends school
{
    private int eng;              //子類別無建構式
    SB(String name, int eng)
    {
        super(name);
        this.eng = eng;
    }
    public String show()
    {
        return super.show() + "\t英文：" + eng;
    }
    void change(int eng)
    {
        this.eng = eng;
    }
    /*
    void skill()
    {
        System.out.println("Hello SB");
    }
    */
}