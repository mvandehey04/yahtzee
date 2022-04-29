
/**
 * A cup that uses dice to play Yahtzee.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cup
{
    private Dice d1, d2, d3, d4, d5;
    private boolean h1, h2, h3, h4, h5;
    
    //constructs new dice and boolean variable to check if a die is aside
    public Cup() {
        d1 = new Dice();
        d2 = new Dice();
        d3 = new Dice();
        d4 = new Dice();
        d5 = new Dice();
        h1 = false;
        h2 = false;
        h3 = false;
        h4 = false;
        h5 = false;
    }
    
    //rolls 5 dice expect for those set aside
    public void rollDice() {
        if(h1 == false) {
          d1.roll();  
          System.out.println("die 1: " + d1.value());
        }
        if(h1 == true) {
            System.out.println("die 1: " + d1.value() + " [aside]");
        }
        
        if(h2 == false) {
          d2.roll();  
          System.out.println("die 2: " + d2.value());
        }
        if(h2 == true) {
            System.out.println("die 2: " + d2.value() + " [aside]");
        }
        
        if(h3 == false) {
          d3.roll();  
          System.out.println("die 3: " + d3.value());
        }
        if(h3 == true) {
            System.out.println("die 3: " + d3.value() + " [aside]");
        }
        
        if(h4 == false) {
           d4.roll(); 
           System.out.println("die 4: " + d4.value());
        }
        if(h4 == true) {
            System.out.println("die 4: " + d4.value() + " [aside]");
        }
        
        if(h5 == false) {
            d5.roll();
            System.out.println("die 5: " + d5.value() +"\n");
        }
        if(h5 == true) {
            System.out.println("die 5: " + d5.value() + " [aside]" +"\n");
        }
         
    }
    
    //set chosen dice aside
    /**
     * Type the number die you would like to set aside.
     */
    public void setAside(int diceAside) {
        if(diceAside == 1) h1 = true;
        if(diceAside == 2) h2 = true;
        if(diceAside == 3) h3 = true;
        if(diceAside == 4) h4 = true;
        if(diceAside == 5) h5 = true;
    }
    
    //add chosen dice back
    /**
     * Type the number die you would like to add back.
     */
    public void addBack(int diceBack) {
        if(diceBack == 1) h1 = false;
        if(diceBack == 2) h2 = false;
        if(diceBack == 3) h3 = false;
        if(diceBack == 4) h4 = false;
        if(diceBack == 5) h5 = false;
    }
    
    public void addAllBack() {
        h1 = false;
        h2 = false;
        h3 = false;
        h4 = false;
        h5 = false;
    }
}
