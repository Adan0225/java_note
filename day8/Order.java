class Order
{
	String name;  //String 表 class
      int Lcd;
	  int Ram;
	  int Mouse;
      int sum;
	  int sum2;
	
	Order(String name,int Lcd,int Ram,int Mouse)  //建構式
	{
		if (Lcd >=0 && Ram>=0 && Mouse>=0)
		 {
		
		  this.name=name;
		  this.Lcd=Lcd;
		  this.Ram=Ram;
		  this.Mouse=Mouse;
		  sum=Lcd*4999+Ram*1280+Mouse*750; //this 加或不加都可
		  sum2=Lcd*4999+Ram*1280+Mouse*750; 
			if(sum>=30000) sum=(int)(sum*0.95);
	      }
	  
	}
	
 void show()  //Method
  {
  System.out.println("訂購名:"+name+"\tLcd:"+Lcd+"\tRam："+Ram+"\tMouse:"+Mouse+"\t打折前金額："+sum2+"\t金額:"+sum);
 
  }

  }

