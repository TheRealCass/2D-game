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
     *  @param Game
     */
    public State(Game game){
        this.game = game;
    }

    /**
     * Method name: update 
     *  @param void 
     * Description: 
     */
    public abstract void update();

    /**
     * Method name: render 
     *  @param Graphics 
     * Description:
     */
    public abstract void render(Graphics gfx);


}