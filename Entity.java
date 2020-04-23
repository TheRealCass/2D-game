import java.awt.Graphics;  //importign graphics obj

/**
 * Class Name: Game 
 * Methods:
 * Description: anything that is not a tile
 * 
 * author @Brown_Buddah 
 * version(4/20/2020)
 */
public abstract class Entity {

    //location
    protected float x, y;

    /**
     * Constructor
     * Argument Type: flaot
     */
    public Entity(float x, float y) {
        this.x = x;
        this.y = y;
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