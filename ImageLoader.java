import java.awt.image.BufferedImage; //importing buffered image
import javax.imageio.ImageIO;  //importing IO for images
/**
 * Class Name: Image Loader 
 * Methods: loadImage
 * Description: loads images
 * 
 * author @Brown_Buddah 
 * version(4/18/2020)
 */
public class ImageLoader{

    
    /**
     * Method name: loadImage 
     *  @param String 
     * Description: loads image from path
     */
    public static BufferedImage loadImage(String path){
        try {

            return ImageIO.read(ImageLoader.class.getResource(path));
       
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
        return null;
    }

}