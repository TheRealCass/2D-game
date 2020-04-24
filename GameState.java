import java.awt.Graphics;
/**
 * Class Name: gameState 
 * Methods: update, render
 * Description: State where player interacts with game
 * 
 * author @Brown_Buddah 
 * version(4/19/2020)
 */

public class GameState extends State {

    private Player player;
    private World world;

    /**
     * constructor
     * Argument type: void
     */
    public GameState(Game game){
        super(game);
        player = new Player(game, 100, 100);  //has player
        world = new World("resources/worlds/world1.txt");  //has world(background aka tileMap)
    
    }

    /**
     * Method name: update 
     * Argument type: void 
     * Description: updates all the variables for each calss it's called on
     */
    public void update(){
        world.update();
        player.update();
    }

    /**
     * Method name: render 
     * Argument type: Graphics 
     * Description: renders to the scfeen
     */
    public void render(Graphics gfx){
        world.render(gfx);
        player.render(gfx);
    }


}