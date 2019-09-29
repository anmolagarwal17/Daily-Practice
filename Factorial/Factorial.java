import java.util.Scanner;

class Factorial
{
	public static void main(String[]args)
	{
		Scanner sca = new Scanner(System.in);
		int num, ans=1;
		System.out.println("Enter a number to find it's factorial:");
		num = sca.nextInt();
		
		for(int i=1; i<=num; i++)
			ans *= i;
		
		System.out.println("Factorial of " + num + " is " + ans);
	}
}