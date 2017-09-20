
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
        while(!nextToABeeper()) {
            move();
        }
        if (nextToABeeper() == true) {
            pickBeeper();
            beeper += 1;
        }
    }
    public void clearRooms() {
        if (beeper == 1){
            turnLeft();
            move();
            if (nextToABeeper() == true) {
                 pickBeeper();
            }
                else{
                 turnLeft(); 
                 turnLeft();
                 move();
                 move();
                 if (nextToABeeper() == true) {
                 pickBeeper();
                }
                    else{
                     turnLeft();
                     turnLeft(); 
                     move();
                     
                    }
                }
        }
    }
}

