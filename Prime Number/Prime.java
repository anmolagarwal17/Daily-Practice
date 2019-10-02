import java.util.Scanner;

class Prime
{
	public static void main(String[]args)
	{
		Scanner sca = new Scanner(System.in);
		System.out.print("Enter a number to find if it is Prime or not:");
		int num = sca.nextInt();
		boolean prime = true;			// setting a number as prime by default

		for(int i=2; i<=num/i; i++)		//for example if i=2 and num=16 then i<=num/2 ==> 2<=8  (if 16 is not divisible by 2 then it must not be divisible by any number greater than 'num/2' i.e 8)
			if(num%i == 0)
			{
				prime = false;			// if the number is completely divisible then it is not prime hence setting prime = false
				break;
			}

		if(prime)
			System.out.println("The entered number is Prime!");
		else
			System.out.println("The entered number is not Prime!");
	}
}