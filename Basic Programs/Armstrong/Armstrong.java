import java.util.Scanner;

class Armstrong
{
    public static void main(String[]args)
    {
        Scanner sca = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sca.nextInt();

        int temp = num, degree=0;
        while(temp!=0)
        {
            temp=temp/10;
            degree++;
        }

        temp = num;
        int armstrong = 0;
        while(temp != 0)
        {
            int rem = temp%10;
            armstrong += Math.pow(rem,degree);
            temp = temp/10;
        }

        if(armstrong == num)
            System.out.println("The entered number is Armstrong!");
        else
            System.out.println("The entered number is not Armstrong!");
    }
}
