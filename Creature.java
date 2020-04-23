
/**
 * Class Name: Creature 
 * Methods:
 * Description: 
 * 
 * author @Brown_Buddah 
 * version(4/20/2020)
 */
public abstract class Creature extends Entity{

    //location
    protected int  health;

    /**
     * Constructor
     * Argument Type: flaot
     */
    public Creature(float x, float y) {
        super(x, y);  //posotion

        health = 10;
    }

    
}