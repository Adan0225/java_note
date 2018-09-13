class add2
{
    public static void main(String args[])
    {
        Order o = new Order("abc", 5, 1);
        //o.show();
        System.out.println("姓名:" + o.getName() + "數量合計:" + o.getRuler() +
                           "支尺及" + o.getPen() + "支筆：" + "總價:" + o.getSum());
    }
}
