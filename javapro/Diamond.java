public class Diamond
{
	public static void main( String args[] )
{
	for(int i=0;i<=10;i++)
{
	System.out.println();
	
	for(int j=0;j<=10;j++)
{
	if(j==5)
{
	System.out.print("*");
}
	else if( j<=5-i || j>=5+i )
{
	System.out.print("*");
}
	else if(i>5 && ( j<=10-i || j>=10-i ))
{
	System.out.print("*");
}	
	else
	System.out.print(" ");
}
}
}//end of main
}//end of class diamond

