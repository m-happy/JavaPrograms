import javax.swing.JOptionPane;
public class AddDialog
{
	public static void main( String args[] )
{
	String s = JOptionPane.showInputDialog("enter ist integer to add in the form of string");
	String t = JOptionPane.showInputDialog("enter the second integer to add in the form of a string");
	int sum;
	a=Integer.parseInt( String s );

	b= Integer.parseInt ( String t );
	sum = s + t;
	System.out.printf("the sum is %d",sum);
}
}

