import javax.swing.JOptionPane;
public class Addition
{
	public static void main(String args[])
	{
		String name = JOptionPane.showInputDialog( null,"what is your name");
		//creating message to show on the Dialog box
		message = String.format("welcome to java programming %s",name);
		//display the message
	
		JOptionPane.showMessageDialog(null,message);
	}
}

