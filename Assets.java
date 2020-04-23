import java.awt.image.*;  //importing buffered image
/**
 * Class Name: assets 
 * Methods:
 * Description: loads all the assets(sound, picture, video) for the game
 * 
 * author @Brown_Buddah
 * version(4/19/2020)
 */
public class Assets {

    public static BufferedImage player;
    public static BufferedImage dirt, grass, stone, tree;

    //width and height of each sprite
    public static final int width = 16;
    public static final int height  = 16;


    /**
     * Method name: initialize
     * Argument type: void
     * Description: loads everythning
     */
    public static void initialize(){
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/resources/textures/sheet.png"));

        player = sheet.crop(width*19, height*12, width, height);
        grass = sheet.crop(width*8, height*0, width, height);
        stone = sheet.crop(width*20, height*10, width, height);
        dirt = sheet.crop(width, height*10, width, height);
        tree = sheet.crop(width*18, height*10, width*2, height*2);

    }

}