class ex3
{
    public static void main(String args[])
    {

        int chi = 65;

        int eng = 78;

        System.out.println("chi>60 && eng>=75 ---->" + !(chi >= 60 &&
                           eng >= 75)); // +! 反轉
        System.out.println("chi>=60 || eng>=75-->" + (chi >= 60 || eng >= 75));
        System.out.println("chi>60 ^ eng>=75 ---->" + (!(chi >= 60) ^ eng >=
                           75)); //^ XOR  (!) 反轉

        /*
                int chi=65;

                System.out.println("chi>60="+(chi>60));
                System.out.println("chi<60="+(chi<60));
                System.out.println("chi>=60="+(chi>=60));
                System.out.println("chi<=60="+(chi<=60));
                System.out.println("chi==60="+(chi==60));
                System.out.println("chi!=60="+(chi!=60));
                */

    }
}