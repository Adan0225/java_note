class school
{

    String name;  //String 表 class
    int chi;
    int eng;
    int sum;
    // double ave;
    // boolean x;

    school(String name, int chi,
           int eng) //local var --正確的位置 （int chi) 等UI給值, 使用者輸入位置


    {
        this.name = name;
        this.chi = chi;
        this.eng = eng;
        sum = chi + eng; //this 加或不加都可

    }
    void change(int chi)   //事後修改 void 類型 名稱
    {
        this.chi = chi;
        sum = chi + eng;
    }


    void show()

    {
        System.out.println("姓名:" + name + "\t國文:" + chi + "\t英文：" + eng +
                           "\t總分:" + sum);

    }

}


