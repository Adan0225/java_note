class SA extends school
{
    private int chi;              //子類別無建構式
    SA(String name, int chi)
    {
        super(name);
        this.chi = chi;
    }
    public String
    show()  //只要名稱引數一樣，判定為要override強制要求更改符合override規則 , protected 封裝權限

    {
        return super.show() + "\t國文:" + chi;
    }

    void change(int chi)
    {
        this.chi = chi;
    }
    /*
    void skill()
    {
        System.out.println("Hello SA");
    }
    */
}