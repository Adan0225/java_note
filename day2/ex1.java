class ex1
{
public static void main (String args[])

{
  System.out.println("10+20"); //"雙引號下都是文字 "
  System.out.println(10+20);  // +連接符號
  System.out.println("10"+"20");
  System.out.println("10"+20);//只要有一邊變文字，就會強制轉成文字
  short x=10;                     //x 要給資料類型
  short y=20;
  short z=10+20;
  short  z2=(short)(x+y);   //Y 自動升級為int類型,解決方式--〉轉型成(short)

  int a=10;
  int b=50;
  int c=10+50;
  int c2=a+b;



/*
  byte    x=10;                           //x 要給資料類型
  byte    y=20;
  byte    z=10+20;
  byte    z2=(byte)(x+y);       //X+Y 自動升級為int類型,解決方式--〉轉型成(byte)

  */
System.out.println("================================");
    float x2=(float)10.2;   //10. -->double
    float x3=10.2f;
    float x4=10.4F;

}

}

 
 