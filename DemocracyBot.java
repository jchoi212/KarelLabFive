
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DemocracyBot extends Robot
{   
    public int beeper = 0;
    public DemocracyBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void fixBallots() {
        check3rdStreet();
        clearRooms();
    }
    public void check3rdStreet() {
        while(frontIsClear() == true) {
          move();
          if(!nextToABeeper()) {
             turnLeft();
             move();
             while (nextToABeeper() == true) {
                 pickBeeper();
                 }
             while (!facingSouth()) {
                 turnLeft();
                }
             move();
             move();
             while (nextToABeeper()) {
                 pickBeeper();
                }
             while (!facingNorth()) {
                 turnLeft();
                }
             move();
             while (!facingEast()) {
                 turnLeft();
                }
            }
        }
    }
    public void clearRooms() {
        
    }
}

