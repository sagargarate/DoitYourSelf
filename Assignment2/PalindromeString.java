class PalindromeString
{
  public static void main(String[] args)
  {
     String s="ssssss";
	 String rev="";
	 
	 for(int i=s.length()-1;i>=0;i--)
	 {
	    rev=rev+ s.charAt(i);
	 }
	 System.out.println("Reverse String is =" +rev);
	 
	 
	 if(s.equals(rev))
	 {
      System.out.println("palindrome");
	 }
     else
    {
	  System.out.println("not palindrome");
    }
  }
}