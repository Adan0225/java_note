class add

{
public static void main (String args [])
	// call by reference

	{
	 
	student s=new student("abc",88,66); //（）等於建構數引數
	student s2=new student(75,80);
	//s-->search stack -->heap
	
	
	//student s2=new student();
	  s.show();
	 s2.show();
	// 宣告物件變數名; new class初始化實體化物件
	
	/*

	System.out.println(s.name); //String 預設null訊號
	System.out.println(s.chi); //.heap --> get heap field. 編譯過值是new給出。new default value =0 
	System.out.println(s.ave); 
	System.out.println(s.x); 
	*/
	
	//System.out.println(s2); 
	// student@xxxxxx-->記憶體位址
					 
	/*
	int x =100;
	
	System.out.println(x);
	*/					 
   

   }

}
						 
						 
