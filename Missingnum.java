package week2.day1;

public class Missingnum {
	
	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5,7,8};
		int sum1=0;
		
		for ( int i=0 ;i<a.length;i++)
		{
			sum1=sum1+a[i];
	
		}

		System.out.println("Sum of element in Array :"+ sum1);
		int sum2=0;
		
	for(int i=1;i<=8;i++)
	{
		sum2=sum2+i;
		
	}
		System.out.println("Missing number : " + (sum2-sum1));
		
	}
}
		
		
		


