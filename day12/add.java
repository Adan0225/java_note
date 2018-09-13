class add
{
    public static void main(String args[])
    {
        /*
                student[][] s =
                {
                    {
                        new student("a1", 80, 70),
                        new student("a2", 70, 70),
                        new student("a3", 90, 70)
                    }, //動態初始化
                    {
                        new student("b1", 80, 70),
                        new student("b2", 70, 70),
                        new student("b3", 90, 70) ,
                        new student("b4", 80, 70)
                    }
                };
        */
        student[][] s = new student[2][];
        s[0] = new student[3];
        s[1] = new student[4];
        s[0][0] = new student("a1", 80, 70);
        s[0][1] = new student("a2", 80, 70);
        s[0][2] = new student("a3", 90, 70);
        s[1][0] = new student("b1", 80, 70);
        s[1][1] = new student("b2", 70, 70);
        s[1][2] = new student("b3", 90, 70);
        s[1][3] = new student("b4", 80, 70);    //靜態初始化
        /*
               for (student x:s[1])
              {
               System.out.println(x);
                 x.show();
              }
        */
        System.out.println("=======================================");

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++)
                //for(student x:s[i])
            {
                s[i][j].show();
            }
        }


    }
}
