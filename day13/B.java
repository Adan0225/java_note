class B extends student
{

    int excel;
    B(String name, int chi, int excel)
    {

        super(name, chi); //只要寫super就是指父類別 ()內變數
        this.excel = excel;
        System.out.println("B班學生, excel:" + excel);
    }
    B(String name, int chi)
    {
        super(name,
              chi); //每寫一個建構式就要增加一個就要加父類別super
        System.out.println("B班學生, excel:" + excel);
    }
    /*

    A(String name, int chi, int word)
    {
        this.name = name;
        this.chi = chi;
        this.eng = eng;
        sum = chi + eng;
    }
    */

    void show()
    {
        System.out.println("姓名:" + name + "\t國文:" + chi + "\tEXCEL：" + excel);
    }
}