package week1.day1;

public class FactorialCode 
{
	public static void main(String[] args) 

	{
		int num = 5;
		int i,fact = 1;
		for(i=1;i<=num;i++)
		{
			fact = fact * i;			
		}
	System.out.println("Factorial of given number is " +fact);
	}
}