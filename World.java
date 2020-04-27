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

    //map data
    private int[][] tilez;
    private int spawnX, spawnY;



    /**
     * Constructor
     *  @param String
     */
    public World(String path){
        loadWorld(path);
    }



    /** 
     * Method Name: loadWorld
     * @param String
     * @return (void) loads world from file
     */
    private void loadWorld(String path){
        String file = Utilities.loadFileAsString(path);  //loads the whole fole as a string
        String[] tokens = file.split("\\s+");  //separates the string using spaces and newLine as dilimeters

        width = Utilities.parseInt(tokens[0]);  //first value is width
        height = Utilities.parseInt(tokens[1]);  //secound value is the height of the map
        spawnX = Utilities.parseInt(tokens[2]);  //3rd value is playern spawn X pos
        spawnY = Utilities.parseInt(tokens[3]);  //4th value is playern spawn y pos

        tilez = new int[width][height];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                tilez[x][y] = Utilities.parseInt(tokens[(x + y * width) + 4]);
            }
        }        
    }

    /**Method Name: update
     *  @param void
     * Retuen Type: void
     * Description: 
     */
    public void update(){
    
    }

    /**Method Name: render
     *  @param Graphics
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
     *  @param int,int
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