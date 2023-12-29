 import java.util.*;
class Main
{
  public static void main (String[]args)
  {
    double a, b, c,d,r1,r2;
    Scanner s = new Scanner (System.in);
      System.out.println ("enter a num ");
      a = s.nextDouble();
      b = s.nextDouble();
      c = s.nextDouble();
      d = (b * b - 4 * a * c);
    if (d == 0)
      {
	System.out.println ("not a leap year");
      }
    else
      {
	r1 = (-b + Math.sqrt (d)) / 2 * a;
	r2 = (-b - Math.sqrt (d)) / 2 * a;
	System.out.println ("Root1=" + r1);
	System.out.println ("Root2=" + r2);

      }
  }
}
