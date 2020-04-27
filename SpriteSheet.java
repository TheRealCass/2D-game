import java.awt.image.BufferedImage; //importing BufferedImage

/**
 * Class Name: Sprite sheet
 * Methods:
 * Description: loads and deals with images on the sprite sheet
 * 
 * author @Brown_Buddah
 * version(4/18/2020)
 */
public class SpriteSheet {

    private BufferedImage sheet;


    /**
     * constructor 
     *  @param String, int, int
     */
    public SpriteSheet(BufferedImage sheet){
        this.sheet = sheet;
    }

    /**
     * Method name: crop
     *   @param void 
     * Description: gives us individual sprite
     */
    public BufferedImage crop(int x, int y, int width, int height){
        return sheet.getSubimage(x, y, width, height);

    }
}