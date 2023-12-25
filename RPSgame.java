package practice;
import java.util.Random;
import java.util.Scanner;
public class RPSgame {

	public static void main(String[] args) {
		
	  Scanner sc = new Scanner(System.in);
	  while(true)
	  {
		String[] options = {"Rock", "Paper","Scissor"};
		
		// Get random option from computer using Random()	
		String cmpOption = options[new Random().nextInt(options.length)];
		
		//Get user option
		System.out.println("\n\nAvailable options are \n Rock \n Paper \n Scissor");
		System.out.println("\nEnter one of the available options");
		String userInput = sc.nextLine();
		System.out.println("\nComputer option is " +cmpOption);
			
		if( (userInput.equalsIgnoreCase("Rock")) || (userInput.equalsIgnoreCase("Paper")) || (userInput.equalsIgnoreCase("Scissor")) )
		{			
			if(cmpOption.equalsIgnoreCase(userInput))
				System.out.println("Its a tie !!! \n Try again");
			
			//Check each user option with computer option
			else if (userInput.equalsIgnoreCase("Rock"))
			{
				if(cmpOption.equalsIgnoreCase("Scissor"))
					System.out.println("You WIN !!!!! \n Congratulations !!!!");
				else if(cmpOption.equalsIgnoreCase("Paper"))
					System.out.println("Computer Wins !!! \n Better Luck Next Time" );
			}
			else if (userInput.equalsIgnoreCase("Paper"))
			{
				if(cmpOption.equalsIgnoreCase("Rock"))
					System.out.println("You WIN !!!!! \n Congratulations !!!");
				else if(cmpOption.equalsIgnoreCase("Scissor"))
					System.out.println("Computer Wins !!! \n Better Luck Next Time" );
			}
			else if (userInput.equalsIgnoreCase("Scissor"))
			{
				if(cmpOption.equalsIgnoreCase("Paper"))
					System.out.println("You WIN !!!!! \n Congratulations !!!");
				else if(cmpOption.equalsIgnoreCase("Rock"))
					System.out.println("Computer Wins !!! \n Better Luck Next Time" );
			}  
		}
		else 
			System.out.println("Invalid input !!!! Please try again");		

		System.out.println();
		String playAgain;
		System.out.println("Do you want to play again? ");
		
		// loop until the user chooses the correct option
	  while(true) {
			
			System.out.println("Type 'yes' or 'no' ");
			playAgain = sc.nextLine();
			
			if(playAgain.equalsIgnoreCase("yes") || playAgain.equalsIgnoreCase("No")) {
				System.out.println();
				System.out.println("*****************************************************************************");
				System.out.println();
				break;
			}
			System.out.println();
			System.out.println("Invalid Input");
		}
		
		if(playAgain.equalsIgnoreCase("no") || playAgain.equalsIgnoreCase("No")) {
			break;
		}
	}
   }
}

