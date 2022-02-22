class SwapNumbers2
{
   public static void main(String[] args)
   {
      int x1=10;
	  int x2=20;
	  
	  x2=x1+x2;
	  x1=x2-x1;
	  x2=x2-x1;
	  
	  System.out.println("value of x1=" +x1);
	  System.out.println("value of x2=" +x2);
	  
   }
}
