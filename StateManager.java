import java.awt.Graphics;  //importing graphics obj
/**
 * Class Name: StateManager
 * Methods: setState, getState Description: abstract class for
 * game states
 * 
 * author @Brown_Buddah 
 * version(4/20/2020)
 */
public class StateManager extends State {

    private static State currentState = null;

    /**
     * constructor
     *  @param Game
     */
    public StateManager(Game game) {
        super(game);
    }

    /**
     * Method name: setSate 
     *  @param State 
     * Description: sets the sate to the one passed in the argument
     */
    public static void setState(State other) {
        currentState = other;
    }

    /**
     * Method name: getState 
     *  @param void 
     * Description: return current state
     */
    public static State getState() {
        return currentState;
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub

    }

    @Override
    public void render(Graphics gfx) {
        // TODO Auto-generated method stub

    }

}