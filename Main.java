class Main
{
	int a,b;
	void get()
	{
		a=10;
		b=20;
	}
	void show()
	{
		System.out.println("a="+a+"b="+b);
	}
	public static void main(String[] args) 
	{
		Main s1=new Main();
		Main s2=new Main();
		s1.get();
		s2.get();
		s1.show();
		s2.show();
	}
}
