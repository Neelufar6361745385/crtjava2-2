import java.io.*;
class Throw
{
		public static void main(String[] args)throws Exception
	{
			FileReader f1=new FileReader("abc.java");
			int ch;
			ch=f1.read();
			while (ch!=-1)
		{
				System.out.println((char)ch);
				ch=f1.read();
		}
		f1.close();
	}
}


 