class ex21
{
    public static void main(String args[])
    {

        /*
            int i = 1;
            do {
                System.out.println("i=" + i + "\thello");
                i++;
            } while ( i <= 15);
        */
        /*
                 int i=1; //需先給初始值
                while( i<=15)
                {
                    System.out.println("i="+i+"\thello");
                    i++;
                }
        */
        /*
                for(int x=1,y=2;x<=25000 || y<=30000;)
                {
                    System.out.println("x="+x+"\ty="+y);
                    x=2*x+500;
                    y=2*y+x;
                }
                */
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("請輸入次數");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            //if (i==121) break;
            //if (i==121)continue; // 跳過這一次不做
            if (i >= 41 && i <= 66) {
                continue;
            }

            if (i >= 85 && i <= 95) {
                continue;
            }

            if (i == 190) {
                break;
            }

            System.out.println("i=" + i + "\t 第" + i + "次");
        }

        /*for(int i=2;i<=100;i+=2)
            // int i=1 計算次數的變數，給起始值
            // ==判斷式 true or false --〉2
            //計算式與2有關
        {
            System.out.println("i="+i+"\thello");
        }*/
        /*
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        */
        //Loop 重覆結構性迴圈，重覆且連續
    }
}