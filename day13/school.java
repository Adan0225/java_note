class school
{
    private String name;
    school(String name)
    {
        this.name = name;
    }
    void change(String name)  //看目的, 為步驟，改名字
    {
        this.name = name;
    }
    void skill()
    {
        System.out.println("Hello");
    }
    protected String show()
    {
        return "名:" + name;
    }
}
