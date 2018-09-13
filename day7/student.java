class student
{
    String name;  //String 表 class
    int chi;
    int eng;
    int sum;
    double ave;
    boolean x;
    student(String name, int chi, int eng)
    //local var --正確的位置 （int chi) 等UI給值, 使用者輸入位置
    {
        this.name = name;
        this.chi = chi;
        this.eng = eng;
        sum = chi + eng; //this 加或不加都可
        ave = sum / 2.;
    }
    student(int chi, int eng)
    {
        this.name = name;
        this.chi = chi;
        this.eng = eng;
        sum = chi + eng; //this 加或不加都可
        ave = sum / 2.;
    }
    // if(chi>=0)
    //{
    //this.chi=chi; //call by reference 同一區塊先找 , 加this(物件類的屬性變數） 指的是object , student object
    // }
    //int chi=60; //宣告變數的生命週期 ，local var
    //chi=60;  //表示不是重新宣告的變數 global var
    //System.out.println("hello world");
    void show()
    {
        System.out.println("姓名:" + name + "\t國文:" + chi + "\t英文：" + eng +
                           "\t總分:" + sum + "\t平均:" + ave + "\tx=" + x);
    }
}
