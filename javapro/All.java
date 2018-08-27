import java.util.Scanner;
public class All
{
	public static void main( String args[] )
	{
		Scanner input = new Scanner ( System.in );
		int num1,num2,sum,sub,multiplication,remainder;
		float division;
		
		System.out.print("enter a number");
		num1 = input.nextInt();
		System.out.print("enter the second number");
		num2 = input.nextInt();
		sum = num1 + num2;
		sub = num1 - num2;
		multiplication = num1 * num2; 
		division = num1 / num2;
		remainder = num1 % num2;
		System.out.printf("the sum of numbers is %d\n",sum);
		System.out.printf("the subtraction of numbers is %d\n",sub);
		System.out.printf("the multiplication of two numbers is %d\n",multiplication);
		System.out.printf("the division of two numbers is %f \n",division);
		System.out.printf("the remainder of two numbers is %d\n",remainder);
	}
}

		
