class addFV
{
    public static void main(String args[])
    {
        FV.title();
        FV.setPv(15000); //定義共同本金，絕對位置
        FV f1 = new FV(0.01, 3);
        FV f2 = new FV(0.012, 3);
        FV f3 = new FV(0.013, 3);
        FV f4 = new FV(0.014, 3);
        f1.show();
        f2.show();
        f3.show();
        f4.show();
        System.out.println("==============================================");
        f2.setPv(20000);
        //f1.title();
        FV.title(); //建議這個寫法，看到class 指的是static 類別類用法 , 用class去呼叫
        f1.show();
        f2.show();
        f3.show();
        f4.show();
    }
}