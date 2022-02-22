class SwapNumbers3
{ 
   static void Swap(int x1,int x2)
   {
     x1=x1^x2^(x2=x1);
      System.out.println("value of x1=" +x1);
	  System.out.println("value of x2=" +x2);	 
   }
   public static void main(String[] args)
   {
      int x1=10,x2=20;
	  
	  Swap(x1,x2);
	  
	  
   }
}