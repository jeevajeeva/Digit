# Digit
import java.io.*;
import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a,b,c,d,e,f,g;
    System.out.println("Enter the input:");
    int n=1234;
    System.out.println(n);
    
    if(n==0)
    {
      System.out.println("Enter a value greaterthan 9");
    }
    else
    {
      a=n%10;
      b=n/10;
      c=b%10;
      d=b/10;
      e=d%10;
      f=d/10;
      g=((f)+(f+e)+(f+e+c)+(f+e+c+a));
      System.out.println("The sum of digits is:"+g);
    }
  }
}
