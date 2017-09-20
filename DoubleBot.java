


import kareltherobot.*;

/**
 * Write a description of class Template here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoubleBot extends Robot
{
    // instance variables - replace the example below with your own
    public int beepers;
    public int initialBeepers = 0;
    public int finalBeepers;
    /**
     * Constructor for objects of class Template
     */
     public DoubleBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
        
    }

    public void doubleBeepers()
    {
        collectBeepers();
        placeFinalBeepers();
        move();
        System.out.println("done");
    }
    public void collectBeepers() {
        move();
        while (nextToABeeper() == true){
            pickBeeper();
            initialBeepers += 1;
            beepers +=1;
        }
        while (beepers > 0) {
            putBeeper();
            beepers -= 1;
        }
        System.out.println(initialBeepers);
    }
    public void placeFinalBeepers() {
      move();
      finalBeepers = initialBeepers*2;
      System.out.println(finalBeepers);
      while (initialBeepers > 0) {
          putBeeper();
          finalBeepers -=1;
        }
      move();
    }
}
