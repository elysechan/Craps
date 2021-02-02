

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
        Scanner in = new Scanner(System.in);
        int turn = 1;
        System.out.println("Welcome to the Craps game. Roll the dice!");
        
    }

    /**
     * Constructor for objects of class Craps
     */
    public static void CrapsInstructions()
    {
        // asking the user if they want instructions
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String[] args)
    {
        //ask if they need in instructions
        System.out.println("Do you need instructions (Y/N)?");
        Scanner in = new Scanner(System.in);
        String instructions = in.nextLine();
        while (instructions.equals("") || instructions.substring(0,1).equalsIgnoreCase("Y"))
        {
            System.out.println("1.Roll two six-sided dice.");
            System.out.println(" 2. a. On first roll, if you get a 7 or 11 you win!");
            System.out.println("2. b. On the first roll, you get a 2, 3, or 12 you lose!");
            System.out.println("2. c. Any other numbers you don't win or lose. The die roll becomes your 'point'");
            System.out.println("3. Keep rolling the dice again until:");
            System.out.println("4. a. You roll the point again and win! ");
            System.out.println("4. b. or you roll a 7 and lose");
                                
       }
            
    }
}

