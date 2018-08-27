import java.util.Scanner;
public class Addition
{
	public static void main( String args[] )
	{
		Scanner input = new Scanner ( System.in );
		int num1,num2,sum;
		System.out.print("enter the first number you want to add");
		num1 = input.nextInt();
		System.out.print("enter the second number you want to add");
		
		num2 = input.nextInt();
		sum = num1 + num2;
		System.out.printf("sum of numbers is %d\n", sum);
	}
}

		

