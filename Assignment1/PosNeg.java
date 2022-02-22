import java.util.*;
class PosNeg
{
  public static void main(String[] args)
  {
    System.out.println("enter the number");
     Scanner sc =new Scanner(System.in);
     int n=sc.nextInt();
	 if(n>0)
	 System.out.println("Positive");
	 else if(n==0)
	 {
	   System.out.println("No positive and no negative");
	 }
	 else
	 {
	    System.out.println("Negative"); 
	 }
  }
}