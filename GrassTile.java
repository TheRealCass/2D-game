/**
 * Class Name: GrassTile 
 * Methods: isSolid
 * Description: 
 * 
 * author @Brown_Buddah 
 * version(4/20/2020)
 */
public class GrassTile extends Tile {




    /**Constructor
     * Argument type: BufferedImage, int
     */
    public GrassTile(int id) {
        super(Assets.grass, id);
    }

    /**
     * Method Name: isSolid
     * Argument type: void
     * Return type: boolean
     * Description: returns true if not walkable
     */
    @Override
    public boolean isSolid(){
        return true;
    }
}