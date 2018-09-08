class school
  {
  
   String name;  //String 表 class
      int chi;
	  int eng;
	  int sum;
   double ave;
   boolean x;
	  
	  student(String name,int chi,int eng) //local var --正確的位置 （int chi) 等UI給值, 使用者輸入位置
	
		  
	  {
		  this.name=name;
		  this.chi=chi;
		  this.eng=eng;
		  sum=chi+eng; //this 加或不加都可
		  ave=sum/2.;
		  
	  }
	  
	
}
