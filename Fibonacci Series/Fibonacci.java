import java.util.Scanner;
import java.util.InputMismatchException;

class Fibonacci
{
	public static void main(String[]args)
	{
		Scanner sca = new Scanner(System.in);
		
		long a=0, b=1, c=1, num;
		System.out.print("Enter maximum number under which you want to get a Fibonacci series:");
		try
		{
			num = sca.nextInt();
			
			if(num < 0)
			{
				System.out.println("Invalid input.");
				return;
			}
			
			System.out.println(a);
			
			if(num == 0)		//only print zero then return
				return;
				
			while(c <= num)
			{
				System.out.println(c);
				c = a + b;
				a = b;
				b = c;
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid input. \nException: "+e);
		}
	}
}