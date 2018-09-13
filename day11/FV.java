class FV
{
    private int fv;
    private double r;
    private  static int pv;  //共用同一個加上 static
    private int n;
    FV(double r, int n)   //建構式不能加static
    {
        this.pv = pv;
        this.r   = r;
        this.n   = n;
        //fv = (int)(pv * (1 + r * n));
    }
    static void title()
    {
        System.out.println("本金\t利率\t年\t單利本利和");
    }
    static void setPv(int x) //不能用pv 改成 x 即可。
    {
        pv = x;
        //this.pv = pv; //有加static 前不能使用this(object)
    }
    /* static void setR(double r) //限定使用不能加static
     {
         this.r = r;
     }
     */
    void show()
    {
        fv = (int)(pv * (1 + r * n));
        /*System.out.println("本金"+pv+
        "\t利率 :"+r+
        "\t年:"+n+
        "\t單利本利和:"+fv);
        */
        System.out.println(+pv + "\t" + r + "\t" + n + "\t" + fv);
    }
}
