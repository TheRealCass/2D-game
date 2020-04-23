import java.awt.Graphics;
/**
 * Class Name: gameState 
 * Methods:
 * Description: State where player interacts with game
 * 
 * author @Brown_Buddah 
 * version(4/19/2020)
 */

public class GameState extends State {

    private Player player;

    /**
     * constructor
     * Argument type: void
     */
    public GameState(Game game){
        super(game);
        player = new Player(game, 100, 100);
    
    }

    /**
     * Method name: update 
     * Argument type: void 
     * Description: 
     */
    public void update(){
        player.update();
    }

    /**
     * Method name: render 
     * Argument type: Graphics 
     * Description:
     */
    public void render(Graphics gfx){
        player.render(gfx);
    }


}