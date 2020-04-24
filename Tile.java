import java.awt.Graphics;
import java.awt.image.BufferedImage; //importing img obj
/**
 * Class Name: Tile 
 * Methods: update, render, getID
 * Description: 
 * 
 * author @Brown_Buddah 
 * version(4/20/2020)
 */
public class Tile {

    //static
    public static Tile[] tiles = new Tile[256];
    public static Tile grassTile = new GrassTile(0);
    public static Tile dirtTile = new DirtTile(1);
    public static Tile rockTile = new RockTile(2);

    //dimentions
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

        tiles[id] = this;
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

    /**Method Name: isSolid
     * Argument type: void
     * Return type: boolean
     * Description: returns true if not walkable
     */
    public boolean isSolid(){
        return false;
    }

    
}