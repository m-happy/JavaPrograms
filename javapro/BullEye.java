import java.awt.Color; //to add color 
import java.util.Random; // to generate random numbers
import java.awt.Graphics; //to draw the shapes
import javax.swing.JPanel; //provides the area to draw
import javax.swing.JFrame; //provides the frame

public class BullEye extends JPanel
{
	public void paintComponent( Graphics g )
	{
		Random randomNumber = new Random();
		super.paintComponent( g );

		int face; //stores the most recent color

		

		int count=10;
		while( count<=200)
		{
			face =1+ randomNumber.nextInt(2);
			switch(face)
			{
				case 1:
					g.setColor( Color.YELLOW );
					break;
				case 2:
					g.setColor( Color.RED );
					break;

			}
			g.fillOval(count,count,230 - 2*count,230 - 2*count);
			count +=10;
		}

	}//end of class paintcomponent

	//create main body
	public static void main( String args[] )
	{
		BullEye panel = new BullEye();
		JFrame application = new JFrame();
		application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		application.add( panel );
		application.setSize( 250,250 );
		application.setVisible( true );
	}//end of method main
}//end of class BullEye

					

