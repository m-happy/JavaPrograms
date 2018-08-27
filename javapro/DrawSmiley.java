import java.awt.Graphics; //provides method for drawing
import javax.swing.JPanel; //provides and area for drawing
import javax.swing.JFrame; //provides an frame for drawing
import javax.swing.JOptionPane; //to take input and outputs in dialog boxes
import java.awt.Color; // provides the color 
public class DrawSmiley extends JPanel
{
	public void paintComponent ( Graphics g )
	{
		super.paintComponent( g );

		//draw the face
		g.setColor( Color.YELLOW );
		g.fillOval( 10,10,200,200);

		//draw the eyes
		g.setColor( Color.BLACK );
		g.fillOval( 50,50,30,30);
		g.fillOval( 130,50,30,30);

		//draw the mouth
		g.setColor(Color.BLACK);
		g.fillOval( 50,110,120,60 );

		//the mouth into a smile
		g.setColor( Color.YELLOW );
		g.fillRect(50,110,120,30);
		g.fillRect(50,120,120,40);
	}//end of method paintcomponent


	public static void main( String args[] )
	{
		DrawSmiley panel = new DrawSmiley();

		//create a frame
		JFrame  application = new JFrame();

		application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		application.add( panel );
		application.setSize( 230,250 );
		application.setVisible( true );
	}//end of method main
}//end of method class
