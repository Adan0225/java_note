class add
{
    public static void main(String args [])
    // call by reference
    {

        school s1 = new school("abc", 88, 66); //（）等於建構數引數
        school s2 = new school("def", 85, 66);

        s1.show();
        s2.show();

        System.out.println("==========================================================");
        s1.change(80);
        s2.change(99);

        s1.show();
        s2.show();


        /*s1.chi=-80;
            s1.sum=s1.chi+s1.eng;
            s1.show();
            s2.show();*/


        //school s2=new school("tt",88,66);
        //s-->search stack -->heap


        //student s2=new student();
        //s.show();
        //s2.show();


    }
}