 import java.util.*;
class Main
{
	public static void main(String[] args) {
	int y;
	Scanner s = new Scanner (System.in);
	System.out.println("enter a num");
	y=s.nextInt();
	if(y%4==0 && (y%100!=0 || y%400==0))
{
		System.out.println("Leap year");
}
else
{	System.out.println("not a leap year");
}
}
}
 