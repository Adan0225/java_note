import static java.util.Arrays.*;
class ex1
{
    public static void main(String args[])
    {
        int [] x = {0, 52, 32, 65, 74, 98};
        System.out.println(x.length);  //印出個數

        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "]=" + x[i]);


        }

        System.out.println("==================================");
        sort(x);  //排序

        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "]=" + x[i]);
        }

        System.out.println(binarySearch(x, 52)); //搜尋
        System.out.println(binarySearch(x, 66));  //輸出-5 第五個
    }
}