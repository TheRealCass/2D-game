import java.awt.Graphics;  //importing graphics obj
/**
 * Class Name: Player 
 * Methods:
 * Description: 
 * 
 * author @Brown_Buddah 
 * version(4/20/2020)
 */
public class Player extends Creature{

    private Game game;


    /**
     * Constructor
     * Argument Type: flaot
     */
    public Player(Game game, float x, float y) {
        super(x, y, Creature.DEFAULT_CREATURE_HEIGHT, Creature.DEFAULT_CREATURE_HEIGHT);  //posotion
        this.game = game;
    }

    /**
     * Method name: getInput 
     * Argument type: void 
     * Description: updates position
     */
    private void getInput(){
        xMove = 0;
        yMove = 0;
        
        //checking keybord for input
        if(game.getKeyManager().up){
            yMove = -speed;
        }//checking for up key
        if(game.getKeyManager().down){
            yMove = speed;
        }//checking for down key
        if(game.getKeyManager().left){
            xMove = -speed;
        }//checking for ;eft key
        if(game.getKeyManager().right){
            xMove = speed;
        }//checking for right key
    }


    /**
     * Method name: update 
     * Argument type: void 
     * Description: updates position
     */
    public void update() {
        getInput();
        move();
    }

    /**
     * Method name: render 
     * Argument type: Graphics 
     * Description: draws player to screen
     */
    public void render(Graphics gfx) {
        gfx.drawImage(Assets.player, (int)x, (int)y, width, height, null);
        //gfx.drawImage(Assets.player, (int)x, (int)y, 64, 64, null);
    }
    
}