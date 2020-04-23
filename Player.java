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
        super(x, y);  //posotion
        this.game = game;
    }

    /**
     * Method name: update 
     * Argument type: void 
     * Description: updates position
     */
    public void update() {
        if(game.getKeyManager().up) {
            y--;
        }
       
        if(game.getKeyManager().down) {
            y++;
        }

        if(game.getKeyManager().left) {
            x--;
        }

        if(game.getKeyManager().right) {
            x++;
        }
    }

    /**
     * Method name: render 
     * Argument type: Graphics 
     * Description: draws player to screen
     */
    public void render(Graphics gfx) {
        gfx.drawImage(Assets.player, (int)x, (int)y, null);
    }
    
}