
/**
 * Dice used by dice cup.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
public class Dice
{
   private Random rand;
   private int num;
   private int diceSide;
   
   //construct dice side
   public Dice() {
       diceSide = 6;
   }
   
   //generates a random number between 1 and dice side
   public void roll() {
       rand = new Random();
       num = rand.nextInt(diceSide) + 1;
   }
    
   //returns value from random number generator
   public int value() {
       return num;
   }
   
}
