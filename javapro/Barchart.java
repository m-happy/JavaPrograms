public class Barchart
{
	public static void main( String args[] )
	{
		int array[] = { 0,0,0,0,0,0,1,2,3,4 };

		System.out.println("Grades distribution");

		for( int counter =0; counter < array.length; counter++)
		{
			if( counter == 10 )
				System.out.printf("%5d",100);
			else
				System.out.printf("%02d-%02d: ",counter*10,counter*10 + 9);

			for( int stars =0; stars < array[counter]; stars++)
				System.out.print("*");
			System.out.println();
		}
	}
}

