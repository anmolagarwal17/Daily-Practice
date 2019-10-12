import java.util.Scanner;

class Palindrome
{
	public static void main(String[]args)
	{
		Scanner sca = new Scanner(System.in);
		System.out.print("Enter a number or a String value:");
		String value = sca.nextLine();
		boolean palindrome = true;

		for(int i=0; i<=value.length()/2; i++)
		{
			char start,end;
			start = value.charAt(i);
			end = value.charAt(value.length()-i-1);

			if(start == end)		// not using equals() method because it can be used only on objects
				continue;
			else
			{
				palindrome = false;
				break;
			}
		}
		if(palindrome)
			System.out.println("Is palindrome!");
		else
			System.out.println("Is not palindrome!");
	}
}