class CAL
{
    static double RArea(double r)
    {
        return 3.14 * r * r;
    }
    static double Rlength(double r)
    {
        return 2 * 3.14 * r;
    }
    static double FV1(int pv, double r, int n)
    {
        return  pv * (1 + r * n);
    }
    static double FV2(int pv, double r, int n)
    {
        return  pv * Math.pow((1 + r), n);
    }
}