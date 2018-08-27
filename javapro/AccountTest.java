import java.util.Scanner;
public class AccountTest
{
	public static void main(String args[] )
{
	Account account1 = new Account ( 50.00 ); //create account object
	Account account2 = new Account ( -7.54 ); //create account object

	System.out.printf("account balance1: %.2f\n",account1.getBalance() );
	
	System.out.printf("account balance2: %.2f\n",account2.getBalance() );

	Scanner input = new Scanner (System.in); //create scanner to obtain input from commond window
	
	System.out.print("enter deposit amount for account1"); //prompt to deposit amount in account1
		
	double depositAmount;
	depositAmount = input.nextDouble();
	System.out.printf("\nadding %.2f money to account1",depositAmount);
	account1.credit( depositAmount ); //add to account 1
	
	
	System.out.printf("account balance1: %.2f\n",account1.getBalance() );
	
	System.out.printf("account balance2: %.2f\n",account2.getBalance() );

	System.out.print("enter the amount to deposit to account2");
	depositAmount = input.nextDouble();
	account2.credit( depositAmount ); //add to account2 balance

	System.out.printf("account balance1: %.2f\n",account1.getBalance() );
	
	System.out.printf("account balance2: %.2f\n",account2.getBalance() );
}
}
	
	
