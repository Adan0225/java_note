/*final*/ class student // class 加 final 不允許繼承
{
    private String name;
    final double pi = 3.14; // 加final是 常數，要給初始值 3.14
    student(String name)
    {
        this.name = name;
    }
    /*final*/ String show()
    {
        return "名:" + name;
    }
    void setName(String name)
    {
        //pi = 5.2;
        this.name = name;
    }
    void change(int x)
    {
    }
}