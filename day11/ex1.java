class FV
{
    private int fv;
    private double r;
    private int pv;
    private int n;
    FV(int fv, double r, int pv, int n)
    {
        this.pv = pv;
        this.r   = r;
        this.n   = n;
        fv = pv(1 + r * n);
    }
    void show()
    {
        System.out.println("本金:" + pv);
    }
}
