import java.util.*;
class LeapYear
{
  public static void main(String[] args)
  {
     System.out.println("enter the year");
     Scanner sc =new Scanner(System.in);
     int y=sc.nextInt();
	 if(y%4 ==0 || y%400==0)
	 System.out.println("Leap year");
	 else
	 {
	 System.out.println("Not a leap year");
	 }
  }
}