
/**
 * Class Name: Creature 
 * Methods:getHealth, setHealth, getSpeed, setSpeed, getXMove, setXMove
 *         getYMove, setYMove
 * Description: 
 * 
 * author @Brown_Buddah 
 * version(4/20/2020)
 */
public abstract class Creature extends Entity{
    
    public static final int DEFAULT_HEALTH = 10;
    public static final float DEFAULT_SPEED = 3.0f;
    public static final int DEFAULT_CREATURE_WIDTH = 32;
    public static final int DEFAULT_CREATURE_HEIGHT = 32;



    protected int health;
    protected float speed;

    //movement
    protected float xMove, yMove;



    /**
     * Constructor
     *  @param game,flaot,float,int,int
     */
    public Creature(Game game, float x, float y, int width, int height) {
        super(game, x, y, width, height);  //posotion & size
        health = DEFAULT_HEALTH;
        speed = DEFAULT_SPEED;
        xMove = 0;
        yMove = 0;
    }


    /**
     * Method Name: move
     *  @param void
     * Return Type: void
     * Description: enables creature to move across the screen
     */
    public void move(){
        x += xMove;
        y += yMove;
    }

    /**
     * Method Name: getHealth
     *  @param void
     * Return Type: int
     * Description: returns the health of the creature
     */
    public int getHealth() {
        return this.health;
    }

    /**
     * Method Name: setHealth
     *  @param int
     * Return Type: void
     * Description: sets the health of the creature
     */
    public void setHealth(int health) {
        this.health = health;
    }
    
    /**
     * Method Name: getSpeed
     *  @param void
     * Return Type: float
     * Description: returns the speed of the creature
     */
    public float getSpeed() {
        return this.speed;
    }

    /**
     * Method Name: setSpeed
     *  @param float
     * Return Type: void
     * Description: sets the speed of the creature
     */
    public void setSpeed(float speed) {
        this.speed = speed;
    }

    /**
     * Method Name: getXMove
     *  @param void
     * Return Type: float
     * Description: gets the xMove variable
     */
    public float getXMove() {
        return this.xMove;
    }

    /**
     * Method Name: setXMove
     *  @param flaot
     * Return Type: void
     * Description: sets the xMove variable
     */
    public void setXMove(float xMove) {
        this.xMove = xMove;
    }

    /**
     * Method Name: getYMove
     *  @param void
     * Return Type: float
     * Description: gets the yMove variable
     */
    public float getYMove() {
        return this.yMove;
    }
    
    /**
     * Method Name: setXMove
     *  @param flaot
     * Return Type: void
     * Description: sets the xMove variable
     */
    public void setYMove(float yMove) {
        this.yMove = yMove;
    }
    
}