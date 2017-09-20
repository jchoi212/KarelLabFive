
import kareltherobot.*; 

/**
 * @author :  D. Appel
 */
public class DangerousBot extends Robot
{
    public int initialBeepers = 0;
    
    public DangerousBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void choosePile() {
        checkForMod();
        pickSafeBeepers();
    }
    public void checkForMod() {
        while (nextToABeeper() == true) {
            pickBeeper();
            initialBeepers += 1;
        }
        if (initialBeepers%2 == 1){
            turnLeft();
        }
            else{
             turnLeft(); 
             turnLeft(); 
             turnLeft(); 
            }
    }
    public void pickSafeBeepers() {
        move();
        while(nextToABeeper() == true) {
           pickBeeper(); 
        }
    }
}

