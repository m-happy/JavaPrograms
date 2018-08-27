
public class Chart
{
	public static void main( String args[] )
{
	double sum=0;
	double a;
	for(int i = 1;i<50;i++)
{

	a=4 + Math.pow(-1,i)*4/(2*i + 1 );
	sum=sum+a;
	System.out.println( sum );
}
}
}

