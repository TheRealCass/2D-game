import java.awt.Graphics;  //importign graphics obj

/**
 * Class Name: Game 
 * Methods: render, update, getX, setX, getY, setY, getHeight, setHeight
 *          getWidth, setWidth
 * Description: anything that is not a tile
 * 
 * author @Brown_Buddah 
 * version(4/20/2020)
 */
public abstract class Entity {

    //location
    protected float x, y;

    //for size
    protected int width, height;

    /**
     * Constructor
     * Argument Type: flaot
     */
    public Entity(float x, float y,int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
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

    /**
     * Method name: getx 
     * Argument type: void 
     * Description: returns x position
     */
    public float getX() {
        return this.x;
    }

    /**
     * Method name: setX 
     * Argument type: float 
     * Description: sets the X position
     */
    public void setX(float x) {
        this.x = x;
    }
    
    /**
     * Method name: getY 
     * Argument type: void 
     * Description: returns the y position
     */
    public float getY() {
        return this.y;
    }


    /**
     * Method name: setX 
     * Argument type: float 
     * Description: sets the Y position
     */
    public void setY(float y) {
        this.y = y;
    }
    
    /**
     * Method name: getWidth 
     * Argument type: void 
     * Description: returns the width of the enitity
     */
    public int getWidth() {
	    return this.width;
    }

    /**
     * Method name: setWidth 
     * Argument type: int 
     * Description: sets the width of the entity
     */
    public void setWidth(int width) {
	    this.width = width;
    }

    /**
     * Method name: getHeight 
     * Argument type: void 
     * Description: returns the width of the enitity
     */
    public int getHeight() {
	    return this.height;
    }

    /**
     * Method name: setWidth 
     * Argument type: int 
     * Description: sets the width of the entity
     */
    public void setHeight(int width) {
	    this.height = width;
    }
}