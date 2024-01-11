class Arg
{
	int a,b;
	void get(int x,int y)
	{
		a=x;
		b=y;
	}
	void show()
	{
		System.out.println("a="+a+ "b="+b);
	}
	public static void main(String[] args) 
	{
		Arg s1=new Arg();
		Arg s2=new Arg();
		s1.get(12,66);
		s2.get(88,43);
		s1.show();
		s2.show();
	}
}
