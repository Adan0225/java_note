/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author adan
 *
 */
class Order
{
    private String name;
    private int ruler;
    private int pen;
    private int sum;
    //每一筆物件 attribute -->field區
    Order(String name, int ruler, int pen)
    {
        //constructors
        if (ruler >= 0 && pen >= 0) {
            this.name = name;
            this.ruler = ruler;
            this.pen = pen;
            sum = ruler * 35 + pen * 29;
        }
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setRuler(int ruler)
    {
        this.ruler = ruler;
    }
    public void setPen(int pen)
    {
        this.pen = pen;
    }
    public String getName()
    {
        return name;
    }
    public int getRuler()
    {
        return ruler;
    }
    public int getPen()
    {
        return pen;
    }
    public int getSum()
    {
        return sum;
    }
    String getsum()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}