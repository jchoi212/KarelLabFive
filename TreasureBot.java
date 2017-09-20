
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class TreasureBot extends Robot
{
    public int beeper = 0;
    public TreasureBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findTreasure() {
        checkDirection();
        toNextBeeper();
        finishHunt();
    }
    public void checkDirection() {
        while (nextToABeeper() == true) {
            pickBeeper();
            beeper +=1;
        }  
        if (beeper == 1) {
            while (!facingNorth()) {
                turnLeft();
            }
        }
        if (beeper == 2) {
            while (!facingEast()) {
                turnLeft();
            }
        }
        if (beeper == 3) {
            while (!facingSouth()) {
                turnLeft();
            }
        }
        if (beeper == 4) {
            while (!facingWest()) {
                turnLeft();
            }
        }
        if (beeper == 5) {
            finishHunt();   
        }
    }
    public void toNextBeeper() {
        while(!nextToABeeper()) {
         move();   
         beeper = 0;
        }
        if (nextToABeeper() == true) {
         checkDirection();   
         toNextBeeper();
        }
    }
    public void finishHunt() {
        turnOff();
    }       
    }

