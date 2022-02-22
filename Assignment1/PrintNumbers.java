import java.util.*;
class PrintNumbers
{

   static void printno(int n)
   {
      if(n>0)
	  {
	     printno(n-1);
		 System.out.println(n+ " ");
	  }
   }
  public static void main(String[] args)
  {
	System.out.println("enter the num");
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
    printno(n);
  }
}