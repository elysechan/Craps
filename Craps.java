
/**
 * Write a description of class Craps here.
 *
 * @author (elyse chan)
 * @version (2/2/21)
 */
import java.util.Scanner;
public class Craps
{
    // instance variables - replace the example below with your own

    public static void CrapsGame()
    {

        Die die = new Die();
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Craps game. Roll the dice");
        System.out.print("Press <Enter> to roll...");
        String pause = in.nextLine();

        die.roll();
        int score = die.getRoll(); 
        System.out.println("\n score " +score);
        if (score == 7 || score == 11)
        {
            System.out.println("Your score = " +score);
            System.out.println("Woohoo! You win.");

        }
        else if (score == 2 || score == 3 || score == 12)
        {
            System.out.println("Your score = " +score);
            System.out.println("Boohoo. You lose");

        }
        else 
        {
            int turn = 0; 
            int point = score;
            System.out.println("Thats your point = " + point);
            while (turn == 0 || point != score)
            {
                turn++;
                System.out.print("Press <Enter> to roll...");
                pause = in.nextLine();
                die.roll();
                score = die.getRoll();
                System.out.println("Your score  = " +score);
                if (score == 7)
                {
                    System.out.println("Your score is " +score);
                    System.out.println("Boohoo.You lose.");
                    point = score;

                }
                else if (score == point)
                {
                    System.out.println("Your score is " +score);
                    System.out.println("Woohoo! You win.");
                    point = score;
                }

            }
        }
    }

    /**
     * Constructor for objects of class Craps
     */
    public static void CrapsInstructions()
    {
        // asking the user if they want instructions
        System.out.println("Do you need instructions (Y/N)?");
        Scanner in = new Scanner(System.in);
        String instructions = in.nextLine();
        if (instructions.equals("") || instructions.substring(0,1).equalsIgnoreCase("Y"))
        {
            System.out.println("1.Roll two six-sided dice.");
            System.out.println(" 2. a. On first roll, if you get a 7 or 11 you win!");
            System.out.println("2. b. On the first roll, you get a 2, 3, or 12 you lose!");
            System.out.println("2. c. Any other numbers you don't win or lose. The die roll becomes your 'point'");
            System.out.println("3. Keep rolling the dice again until:");
            System.out.println("4. a. You roll the point again and win! ");
            System.out.println("4. b. or you roll a 7 and lose");

        }
        System.out.println();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String[] args)
    {
        System.out.println("Do you want to play? (Y/N)");
        Scanner in = new Scanner(System.in);
        String play = in.nextLine();
        while (play.equals("")||play.substring(0,1).equalsIgnoreCase("Y"))
        {
            CrapsInstructions();
            CrapsGame();
            System.out.println("Do you want to play again? (Y/N)");
            play = in.nextLine();
        }
        if (play.substring(0,1).equalsIgnoreCase("n"))
        {
            System.out.println("Thanks for playing. Have a good day!");
        }
    }

}

