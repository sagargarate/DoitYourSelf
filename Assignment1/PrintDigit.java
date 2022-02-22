import java.util.*;
class PrintDigit
{
  public static void main(String[] args)
  {
	  int digit;
    System.out.println("enter the num");
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	while(n>0)
	{
	  digit=n%10;
	  System.out.print(digit+ " ");
	  n=n/10;
	}
  }
}