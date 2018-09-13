class ex4
{
    public static void main(String args[])
    {
        int [][][] x = new int[2][][];
        x[0] = new int[2][];
        x[0][0] = new int[2];
        x[0][1] = new int[3];
        x[1] = new int[3][];
        x[1][0] = new int[2];
        x[1][1] = new int[2];
        x[1][2] = new int[2];
        System.out.println(x);
        System.out.println(x.length);
        System.out.println(x[0]);
        System.out.println(x[1].length);
        System.out.println(x[0][0]);
        System.out.println(x[0][1].length);
        System.out.println(x[0][0][0]);
        System.out.println(x[1][2]);

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                for (int k = 0; k < x[i][j].length; k++) {
                    System.out.println("x[" + i + "][" + j + "]+[" + k + "]=" + x[i][j][k]);
                }
            }
        }

        /*
        for (int i = 0; i < x.length; i++)
        {
            for (int j = 0; j < x[i].length; j++)
            {
                System.out.println("x[" + i + "][" + j + "]=" + x[i][j]);
                //System.out.println("x["+i+"]["+j+"]="+x[i][j]);
            }
        */
    }
}
