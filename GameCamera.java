/**
 * Class Name: GameCamera 
 * Methods:
 * Description: enables camera to move with the player 
 * 
 * author @Brown_Buddah 
 * version(4/30/2020)
 */
public class GameCamera {

    //coordinates
    private float xOffset;
    private float yOffset;

    //game obj to get a reference of the entity to follow
    private Game game;


    /**
     * Constructor
    * @param game,float,flaot
     */
    public GameCamera(Game game, float xOffset, float yOffset){
        this.game = game;
        this.xOffset = xOffset;
        this.yOffset = yOffset;
    }



    

    /**
     * Method name: getXOffset
     * @param void
     * @return (float) xOffset variable
     */
    public float getXOffset() {
        return this.xOffset;
    }

    /**
     * Method name: setXOffset
     * @param float
     * @return (void) sets yOffset variable
     */
    public void setXOffset(float xOffset) {
        this.xOffset = xOffset;
    }

    /**
     * Method name: getYOffset
     * @param void
     * @return (float) gets yOffset variable
     */
    public float getYOffset() {
        return this.yOffset;
    }

    /**
     * Method name: getYOffset
     * @param void
     * @return (void) gets yOffset variable
     */
    public void setYOffset(float yOffset) {
        this.yOffset = yOffset;


    }

    /**
     * Method name: move
     * @param float,float
     * @return (void) adds move amnt to offset
     */
    public void move(float xAmount, float yAmount) {
        this.xOffset += xAmount;
        this.yOffset += yAmount;


    }

    /**
     * Method name: centerOnEntity
     * @param entity
     * @return (void) cenetrs camera on enity
     */
    public void centerOnEntity(Entity e){
        xOffset = e.getX() - game.getWidth() / 2 + e.getWidth() / 2; //ventering hroizontally
        yOffset = e.getY() - game.getHeight() / 2 + e.getHeight() /2;  //centering vertically
        
    }

}