import java.awt.Graphics;
import java.awt.image.BufferedImage; //importing img obj
/**
 * Class Name: Tile 
 * Methods:
 * Description: 
 * 
 * author @Brown_Buddah 
 * version(4/20/2020)
 */
public class Tile {

    public static final int TILE_WIDTH = 32;
    public static final int TILE_HEIGHT = 32;

    protected BufferedImage texture;
    protected final int id;



    /**
     * Constructor
     * Argumetn Type: BefferedImage, int
     */
    public Tile(BufferedImage texture, int id){
        this.texture = texture;
        this.id = id;
    }

    /**
     * Method Name: getID
     * Argument Type: void
     * Return type: int
     * Description: getter for id variable
     */
    public int getID(){
        return id;
    }

    /**
     * Method Name: update
     * Argument Type: void
     * Return type: void
     * Description: 
     */
    public void update(){
        
    }

    /**
     * Method Name: render
     * Argument Type: void
     * Return type: void
     * Description: 
     */
    public void render(Graphics gfx, int x, int y){
        gfx.drawImage(texture, x, y, TILE_WIDTH, TILE_HEIGHT, null);
    }

    
}