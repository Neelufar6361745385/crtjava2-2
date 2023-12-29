 import java.util.*;
class Main
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a,b,r;
		System.out.println("Enter two nos");
		a=s.nextInt();
		b=s.nextInt();
		if(b==0)
		{
			System.out.println("second no cannot be zero");
	  
		}
			r=a/b;
			System.out.println("the result is "+r);
	}
}
