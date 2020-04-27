/**
 * Class Name: GameCamera 
 * Methods:
 * Description: enables camera to move with the player 
 * 
 * author @Brown_Buddah 
 * version(4/27/2020)
 */
public class GameCamera {

    private float xOffset;
    private float yOffset;



    /**
     * Constructor
    * @param float,flaot
     */
    public GameCamera(float xOffset, float yOffset){
        this.xOffset = xOffset;
        this.yOffset = yOffset;
    }

    /**
     * @param void
     * @return (float) xOffset variable
     */
    public float getXOffset() {
        return this.xOffset;
    }

    /**
     * @param float
     * @return (void) sets yOffset variable
     */
    public void setXOffset(float xOffset) {
        this.xOffset = xOffset;
    }

    /**
     * @param void
     * @return (float) gets yOffset variable
     */
    public float getYOffset() {
        return this.yOffset;
    }

    public void setYOffset(float yOffset) {
        this.yOffset = yOffset;
    }

}