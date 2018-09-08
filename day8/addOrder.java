import java.util.Scanner;
//相對路徑
import java.util.Timer;
//建議用這用寫,不建議用.*

//import java.util.*;  


class addOrder
{
public static void main (String args [])
	// call by reference

	{

	byte x=10;
	Byte x2=10;
	System.out.println(x);
	System.out.println(x+x2);
	String x3="12";
	//System.out.println(x+x3);
	System.out.println(x+Byte.parseByte(x3));
	System.out.println("===================");	   
				
					   
	
   //	java.util.Scanner sc = new java.util.Scanner(System.in);
   //絕對路徑 
	
	Scanner sc=new Scanner(System.in);
	//相對路徑 指進來 import 
	//Timer T1=new Timer();
	
	
	Order a1=new Order("abc",1,1,-1); //（）等於建構數引數
	Order a2=new Order("def",5,3,5);
	//student s2=new student(75,80);
	//s-->search stack -->heap
	
	
	//student s2=new student();
	 a1.show();
	 a2.show();
	
	System.out.println(Math.abs(-5));
	System.out.println((int)(Math.random()*100));
	System.out.println(Math.pow(9,1/3));
	 //s2.show();
 }
}