class student
{
    private String name;
    private int chi;
    private int eng;
    private int sum;
    student(String name, int chi, int eng)
    {
        this.name = name;
        this.chi = chi;
        this.eng = eng;
        sum = chi + eng;
    }
    void show()
    {
        System.out.println("姓名:" + name + "\t國文:" + chi + "\t英文：" + eng +
                           "\t總分:" + sum);
    }
}