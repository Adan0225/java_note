class addOrder
{
    public static void main(String args[])
    {
        /*
        Order[] o = new Order[3]; //類型一樣[]-->個數 ，new []  o0],o[1],o[2]

            o[0] = new Order("abc1", 4, 5);
            o[1] = new Order("abc2", 4, 5);
            o[2] = new Order("abc3", 4, 5); //用new動態初始化
            */
        Order[] o = {
            new Order("abc1", 4, 5),
            new Order("abc2", 4, 5),
            new Order("abc3", 4, 5),
        };
        System.out.println(o);

        //System.out.println(o[0]);
        for (int i = 0; i < o.length; i++) {
            System.out.println("o[" + i + "] = " +
                               o[i] + "\t" +
                               o[i].getName() + "\t" +
                               o[i].getRuler() + "\t" +
                               o[i].getPen() + "\t" +
                               o[i].getSum());
        }

        System.out.println(" == == == == == == == == == == == == == == = ");

        for (Order x : o) { //x=new Order("abc1",4,5);
            System.out.println(x + "\t" +
                               x.getRuler() + "\t" +
                               x.getPen() + "\t" +
                               x.getSum());
        }
    }
    /*
    Order o1=new Order("abc1",4,5);
    Order o2=new Order("abc2",4,5);
    Order o3=new Order("abc3",4,5);
    /*
    for(int i =i;i<3;i++)
    {
    System.out.println("oi")
    }
    */
}
