import java.awt.Graphics;  //importing graphics obj

import org.graalvm.compiler.lir.amd64.AMD64ControlFlow.ReturnOp;
/**
 * Class Name: world 
 * Methods: 
 * Description: 
 * 
 * author @Brown_Buddah 
 * version(4/20/2020)
 */
public class World {

    //dimentions
    private int width, height;
    private int[][] tiles;



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
        //demo
        width = 5;
        height = 5;
        tiles = new int[width][height];
        for (int y = 0; y < width; y++) {
            for (int x = 0; x < height; x++) {
                tiles[x][y] = 0;  //grasstile
            }
        }
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
     * Return Type:
     * Description:
     */
    public void render(Graphics gfx){
        for (int y = 0; y < height; y++) {
            for(int x =0; x < width; x++){
                getTile(x, y);
            }
        }
    }

    /**Method Name: getTile
     * Argument Type: int, int
     * Return Type: Tile
     * Description:
     */
    public Tile getTile(int x, int y){
        Tile t = Tile.tiles[tiles[x][y]];
        if(t == null){
            return Tile.dirtTile;
        } 
        return t;
    }

}