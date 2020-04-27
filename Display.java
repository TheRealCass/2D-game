import javax.swing.JFrame; //for displaying windows
import java.awt.*;  //for canvas obj

/**
 * Class Name: Display 
 * Methods: getCanvas
 * Description: Handles screen renders
 * 
 * author @Brown_Buddah 
 * version(4/18/2020)
 */
public class Display {

    private JFrame frame; //window to screen
    private Canvas canvas;  //to draw images
    
    //variables for the window
    private  String title;
    private int width, height;

    /**
     * constructor
     * Argument type:String, width, height
     */
    public Display(String title, int width, int height){
        this.title = title;
        this.width = width;
        this.height = height;

        createDisplay();  //initialising the JFrame        
    }

    /**
     * Method name: createDisplay 
     *  @param void 
     * Description: initialises JFrame. Set values and requirments for the JFrame
     */
    public void createDisplay(){
        frame = new JFrame(title);
        frame.setSize(width, height);  //setting the dimentions of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //makes sure games closes when window does too
        frame.setResizable(false);  //user can't resize the window dimentions
        frame.setLocationRelativeTo(null);  //window open in the middle
        frame.setVisible(true);  //makes window visible

        canvas = new Canvas();  //creating canvas
        //setting dimentions for the canvas
        canvas.setPreferredSize(new Dimension(width, height));  
        canvas.setMinimumSize(new Dimension(width, height));
        canvas.setMaximumSize(new Dimension(width, height));
        canvas.setFocusable(false);  //only focous is our application

        frame.add(canvas);  //aaddig canvas to the Jframe
        frame.pack();  //resizeing window a little so it fits in the sceen
    }


    /**
     * Method name: getCanvas 
     *  @param void 
     * Description: returns the canvas variable
     * 
     */
    public Canvas getCanvas(){
        return canvas;
    }

    /**
     * Method name: getCanvas 
     *  @param void 
     * Return type: JFrame
     * Description: returns the frame variable
     * 
     */
    public JFrame getJFrame(){
        return frame;
    }




}