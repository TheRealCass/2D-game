import java.awt.Graphics;  //importing graphics obj

/**
 * Class Name: world 
 * Methods: update, render, getTile
 * Description: background or Tilemap
 * 
 * author @Brown_Buddah 
 * version(4/20/2020)
 */
public class World {

    //dimentions
    private int width, height;
    private int[][] tilez;



    /**
     * Constructor
     * Argument type: String
     */
    public World(String path){
        loadWorld(path);
    }



    /** Method Name: loadWorld
     * Argument type: String
     * Return type: void
     * Description: 
     */
    private void loadWorld(String path){
        
    }

    /**Method Name: update
     * Argument Type: void
     * Retuen Type: void
     * Description: 
     */
    public void update(){

    }

    /**Method Name: render
     * Argument Type: Graphics
     * Return Type: void
     * Description: renders the tile at x, y
     */
    public void render(Graphics gfx){
        for (int y = 0; y < height; y++) {
            for(int x =0; x < width; x++) {
                getTile(x, y).render(gfx, x * Tile.TILE_WIDTH, y * Tile.TILE_HEIGHT);
            }
        }
    }

    /**Method Name: getTile
     * Argument Type: int, int
     * Return Type: Tile
     * Description: returns the type of tyle at that x,y location
     *              If null, returns a dirt tile
     */
    public Tile getTile(int x, int y){
        Tile t = Tile.tiles[tilez[x][y]];
        if(t == null){
            return Tile.dirtTile;
        } else {
            return t;
        }
    }

}