class First 
{
	void m1()
	{
		System.out.println("M1 METHOD IN FIRST CLASS");
	}
	void m2()
	{
		System.out.println("M2 METHOD IN FIRST CLASS");
	}
}
class Second extends First
{
		void m3()
	{
			System.out.println("M3 METHOD IN SECOND CLASS");
	}
}
class Tasks
{
	public static void main(String args[])
	{
		Second S1=new Second();
		S1.m1();
		S1.m2();
		S1.m3();
	}
}

	