package week2.day1;

public class Calculator {
	
	public int addnumbers(int a,int b, int c)
	{
		int d=a+b+c;
		return d;
	}
	public int subnumbers(int a,int b)
	{
		int c=a-b;
		return c;
	}
	
	public int mulnumbers()
	{
		int h = 15;
		int i = 7890;
		int c = h*i;
		return c;
	}
public double divnumber(int a,int b)
{
	int c=a/b;
	return c;
	
}


	public static void main(String[] args)
	{
		Calculator c = new Calculator();
		System.out.println("The addition of twonumbers =" +c.addnumbers(5,4,4));
		System.out.println("The subtraction of twonumbers =" +c.subnumbers(5,8));
		System.out.println(c.divnumber(25,8));
		System.out.println(c.mulnumbers());
		
		
	}

}

