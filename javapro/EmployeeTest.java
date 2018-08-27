import java.util.Scanner;
public class EmployeeTest
{
	public static void main( String args[] )
{
	Employee employee1 = new Employee( "Happy" , "Mahto" , 1000000 ); //create employee object
	Employee employee2 = new Employee( "Hamveer" , "Singh" , 100000 ); //create employee object

	//display names and initial salary of both the employee
	System.out.printf("employee no 1 is:\n %s %s and its salary %.2f\n",employee1.getFirstName(),employee1.getLastName(),employee1.getSalary());
	System.out.printf("employee no 2 is:\n %s %s and its salary %.2f\n",employee2.getFirstName(),employee2.getLastName(),employee2.getSalary());
	
	employee1.raise();
	employee2.raise();

	System.out.printf("employee no 1 is:\n %s %s and its salary %.2f\n",employee1.getFirstName(),employee1.getLastName(),employee1.getSalary());
       System.out.printf("employee no 2 is:\n %s %s and its salary %.2f\n",employee2.getFirstName(),employee2.getLastName(),employee2.getSalary());	
	
}//end main
}//end class Employeetest


	
