import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
/**
 * Class Name: keyManager 
 * Methods:
 * Description: handles user input from keybord
 * 
 * author @Brown_Buddah 
 * version(4/20/2020)
 */
public class KeyManager implements KeyListener {

    private boolean[] keys;// all keys array
    public boolean up, down, left, right;  //arraow keys

    //debug
    private boolean DEBUG = false;


    /**
     * constructor
     *  @param void
     */
    public KeyManager(){
        keys = new boolean[256];
    }

    /**
     * Method Name: KeyPressed
     *  @param keyEvent
     * Return type: void
     * discription: gets keycode for button & turns it true
     */    
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;
        if(DEBUG)
            System.out.println("Pressed!");
    }

    /**
     * Method Name: keyReleased
     *  @param keyEvent
     * Return type: void
     * discription: gets keycode for button & turns it false
     */
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
    }

    /**
     * Method Name: update
     *  @param void
     * Return type: void
     * discription: 
     */
    public void update() {
        up = keys[KeyEvent.VK_W];
        down = keys[KeyEvent.VK_S];
        left = keys[KeyEvent.VK_A];
        right = keys[KeyEvent.VK_D];
    }

    /**
     * Method Name: keyTyped
     *  @param keyEvent
     * Return type:
     * discription:
     */
    public void keyTyped(KeyEvent e) {

    }

}