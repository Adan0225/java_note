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
    void setName(String name)
    {
        this.name = name;
    }
    void setRuler(int ruler)
    //setlet ->set 名（引數):void;write
    {
        this.ruler = ruler;
        sum = ruler * 35 + pen * 29;
    }
    void setPen(int pen)
    {
        this.pen = pen;
        sum = ruler * 35 + pen * 29;
    }
    String getName()
    {
        return this.name;
    }
    int getRuler()
    {
        return ruler;
    }
    int getPen()
    {
        return pen;
    }
    int getSum()
    {
        return sum;
    }
}
