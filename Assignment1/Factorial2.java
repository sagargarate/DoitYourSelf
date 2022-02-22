import java.util.Scanner;
class Factorial2
{
  static int factorial(int n)
  {
    if(n==0)
	return 1;
	else
	{
	  return(n*factorial(n-1));
	}
  }

  public static void main(String[] args)
  {
     int fact=1;
     System.out.println("Enter the num");
	 Scanner sc= new Scanner(System.in);
	 int n=sc.nextInt();
	 fact=factorial(n);
	 System.out.println("factorial of" +n+ "is" +fact);
	 
  }
  
  
}