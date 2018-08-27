import java.util.Scanner;
public class Analysis
{
	public void processExamResult()
{
	//create a scanner to take the output from the user
	Scanner input = new Scanner ( System.in );
	
	//initializing variables in declarationn
	int passes=0;
	int failure=0;
	int studentCounter=1;
	int result;//one obtains the exam results from the user

	//process 10 students using while controlled loops
	while( studentCounter <= 10 )
{
	//prompts the user to enter the results
	System.out.print("enter the results (1 for pass) and (2 for fail ):");
	result = input.nextInt();
	if( result == 1 )
		passes = passes + 1;
	else
		failure = failure + 1;

	studentCounter = studentCounter + 1;
}

	// Displaying results 
	System.out.printf("\npassed:%d \n failed:%d\n",passes,failure);
	
	//determine whether more than 8 students passed or not
	if( passes > 8 )
		System.out.print("Raise tution");
}//end of method process exam results

}//end of class Analysis

	
