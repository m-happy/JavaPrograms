import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Concentric extends JPanel
{
	public void paintComponent ( Graphics g )
	{
		super.paintComponent( g );

		int count = 10;
		while( count <=200 )
		{
			g.drawOval( count,count,250 - 2*count,250 - 2*count );
			count +=10;
		}//end of while
	}//end of paint component

	//create a main to to test the concentric circles
	public static void main( String args[] )
	{
		Concentric panel = new Concentric();

		JFrame application = new JFrame(); //create a frame to draw

		application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

		application.add( panel );
		application.setSize( 250,250 );
		application.setVisible( true );
	}//end of main
}//end of class concentric circle

