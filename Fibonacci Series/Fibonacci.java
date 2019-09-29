import java.util.Scanner;

class Fibonacci
{
	public static void main(String[]args)
	{
		Scanner sca = new Scanner(System.in);
		
		long a=0, b=1, c=1, num;
		System.out.println("Enter maximum number under which you want to get a Fibonacci series:");
		num = sca.nextInt();
		System.out.println(a);
		while(c < num)
		{
			System.out.println(c);
			c = a + b;
			a = b;
			b = c;
		}
	}
}