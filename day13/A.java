class A  extends student  //繼承
{
    int word;
    A(String name, int chi, int word)
    {
        super(name, chi); //只要寫super就是指父類別 ()內變數
        this.word = word;
        System.out.println("A班學生, word:" + word);
    }
    A(String name, int chi)
    {
        super(name,
              chi); //每寫一個建構式就要增加一個就要加父類別super
        System.out.println("A班學生, word:" + word);
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
        System.out.println("姓名:" + name + "\t國文:" + chi + "\tWORD：" + word);
    }
}