import java.awt.Graphics;
import javax.swing.JPanel;
public class DrawPanel extends JPanel
{
	public void paintComponent( Graphics g)
{
	//call paintcompoenent to ensure the panel display correctly
	super.paintComponent( g );
	int width = getWidth(); //total width
	int height = getHeight(); //total height
	//draw a line to upper left to the lower right
	g.drawLine( 0,0,width, height);
	//draw a line to lower-left to upper-right
	g.drawLine(0,height,width,0);
	}
}

