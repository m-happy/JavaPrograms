import java.util.Random;

public class Craps
{
	public static void main(String args[] )
	{
		Craps game = new Craps();
		game.play();
	}//end of method main


	//create random to generator for use in method rolldice
	private Random randomNumber = new Random();

	//enumeration with constants that represents the game status
	private enum Status { CONTINUE, WON, LOST };
	
	//constants that represent common rolls of the dice
	private final static int SNAKE_EYES = 2;
	private final static int TRAY = 3;
	private final static int SEVEN = 7;
	private final static int ELEVEN = 11;
	private final static int BOX_CARS = 12;

	//plays one game of craps
	public void play()
	{
		int myPoint = 0; //point if no win or loss on first roll
		Status gameStatus; //can contain continue,win or loss
		int sumOfDice = rollDice();

		//determine game status and point based on first roll
		switch( sumOfDice )
		{
			case SEVEN: //win with 7 on first roll
			case ELEVEN: //win with 11 on first roll
				gameStatus = Status.WON;
				break;
			case SNAKE_EYES: //lose with 2 on first roll
			case TRAY: //loss with 3 on first roll
			case BOX_CARS:
				gameStatus = Status.LOST;
				break;
			default: //did not win or lose,so remember point
				gameStatus = Status.CONTINUE; //game is not over
				myPoint = sumOfDice; //remember the point
				System.out.printf("point is %d\n",myPoint);
				break; //option at end of switch
		}//end of switch
		//while game is not complete
		while(gameStatus == Status.CONTINUE)
		{
			sumOfDice = rollDice();

			//determine game status'
			if(sumOfDice == myPoint)
				gameStatus = Status.WON;
			else if( sumOfDice == SEVEN )
					gameStatus = Status.LOST;
		}//END OF WHILE
		
		//DISPLAY WON OR LOSS MESSAGE
		if ( gameStatus == Status.WON )
			System.out.println("player wins");
		else
			System.out.println("player loses");
	}//end of method play

	//roll dice, calculate sum and display results
	public int rollDice()
	{
		//pick random die value
		int die1 = 1 + randomNumber.nextInt(6); //first die rolled
		int die2 = 1 + randomNumber.nextInt(6); //second die rolled

		int sum = die1 + die2;

		//display results of this roll
		System.out.printf("player rolled %d + %d = %d\n",die1,die2,sum);
		return sum;
	}//end of method roll dice
}//end of class

