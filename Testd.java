abstract class Parent
{
	void show()
	{
		System.out.println("Show method in parent class");
	}
	public abstract void m1();
}
class Child extends Parent
{
	public void m1()
	{
		System.out.println("Abstract methods in child class");
	}
}
class Testd
{
	public static void main(String args[])
	{
		Child c1=new Child();
		c1.show();
		c1.m1();
	}
}

 