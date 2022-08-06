package week1.day1;

public class ConvertNegativeToPositive {
	
	public static void main(String[] args) 
	{
	int num = -40;
	if (num<0)
	{
		num = -num;
		System.out.println("converted number " + num);
	}
	else
	{
		System.out.println("The converted number is Negative");
	}
	
	
}
}
