import java.awt.Graphics;  //importing graphics obj
/**
 * Class Name: State 
 * Methods: update, render
 * Description: abstract class for game states
 * 
 * author @Brown_Buddah 
 * version(4/19/2020)
 */
public abstract class State {

    protected Game game;

    /**
     * Constructor
     * Argument type: Game
     */
    public State(Game game){
        this.game = game;
    }

    /**
     * Method name: update 
     * Argument type: void 
     * Description: 
     */
    public abstract void update();

    /**
     * Method name: render 
     * Argument type: Graphics 
     * Description:
     */
    public abstract void render(Graphics gfx);


}