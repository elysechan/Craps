
/**
 * Write a description of class Die here.
 *
 * @author (elyse chan)
 * @version (2/2/21)
 */

import java.util.Scanner;
public class Die
{
    // instance variables - replace the example below with your own
    private int dice1;
    private int dice2;
    private int sum;
    /**
     * Constructor for objects of class Die
     */
    public Die()
    
    {
        dice1 = 0;
        dice2 = 0;
        sum = 0;
    }
    public void roll() 
    {
        dice1 = (int)(Math.random() * 6 +1);
        dice2 = (int)(Math.random() * 6 +1);
        sum = dice1 + dice2;
    }
    public int getRoll()
    {
        return sum;
    }
}
