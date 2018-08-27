public class Employee
{
	private String firstName; //declaring the instance variable
	private String lastName; //declaring the instance variable
	private double salary; //declaring the instance variable

//constructor initializes firstname ,lastname, income	as arguments
	public Employee( String name, String surname, double income ) 
{
	firstName = name; //initializes firstname
	lastName = surname; //initializes lastname
	if(income > 0.0)
	salary = income; //initializes salary
} //end constructor

	//method to set firstname,lastname and income
	public void setVariables( String name, String surname, double income )
{
	firstName = name; //set firstname
	lastName = surname; //set lastname
	salary = income; //set salary
																																
}//end method setVariables

	//method to retrive the information
public String getFirstName()
{
	return firstName;
} //end of method getfirstname
public String getLastName()
{
	return lastName;
} //end of method getlastname
public void raise()
{
	salary = salary + 10000;
}
public double getSalary()
{
	return salary;
} //end of method getsalary

//method to raise the salary of the employee's


}


	
