package week1.day1;

public class FibinacciCode 
{
		public static void main(String[] args) 
		{	
			int count=7, num1=0, num2=1;
			
			System.out.println(num1);
			
			for (int i = 1; i <= count; i++) 
			{	
				int	sum = num1+num2; 
				num1 = num2;
				num2 = sum;
				System.out.println(num1);	
				
			}
		}
}