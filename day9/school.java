class school
{
    private String name;  //String 表 class , private 封裝權限
    private int chi;
    private int eng;
    private int sum;
    //每一筆物件attribute -->field區
    // double ave;
    // boolean x;
    school(String name, int chi, int eng)
    //constructors
    //local var --正確的位置 （int chi) 等UI給值, 使用者輸入位置
    {
        this.name = name;
        this.chi = chi;
        this.eng = eng;
        sum = chi + eng; //this 加或不加都可
    }
    void abc(String name)
    {
        this.name = name;
    }
    void abc(int chi)
    {
        this.chi = chi;
    }
    void abc(String name, int chi, int eng)
    {
        this.name = name;
        this.chi = chi;
        this.eng = eng;
        sum = chi + eng;
    }
    void abc(String name, int chi)
    {
    }
    void abc(int chi, String name)
    {
    }
    /*
        int abc(int xyz)
        {
            return 0;
        }
    */
    /*
        void abc(int xyz)
        {
        }
    */
        
    
    void change(int chi)   //不傳值類，事後修改 void 類型 名稱
    {
        this.chi = chi;
        sum = chi + eng;
    }


    int change2(int chi)   //
    {
        this.chi = chi;
        sum = chi + eng;
        return this.chi;  //傳值類，重點是類型 ，符合即可
    }

    
    void show()
    {
        System.out.println("姓名:" + name + "\t國文:" + chi + "\t英文：" + eng +
                           "\t總分:" + sum);

    

    }
}
