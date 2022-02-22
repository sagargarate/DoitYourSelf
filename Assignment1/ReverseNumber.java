import java.util.*;
class ReverseNumber
{

   public static void main(String[] args)
   {
	   int reverse=0;
      System.out.println("Enter the number");
	  Scanner sc= new Scanner(System.in);
	  int n= sc.nextInt();
	  
	  while(n!=0)
	  {
	     int r=n%10;
		 reverse=reverse*10+r;
		 n=n/10;
	  }
	  System.out.println("Reverse Number=" +reverse);
   }
}