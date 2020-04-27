import java.awt.Graphics; //importing graphics obj
//buffreedImage and BufferedStrategy
import java.awt.image.BufferStrategy;

/**
 * Class Name: Game Methods: initalize, update, render, run, start, stop
 * Description: main part of the game
 * 
 * author @Brown_Buddah version(4/19/2020)
 */
public class Game implements Runnable {

    // variables for the window
    private Display display;
    public int width, height;
    public String title;

    private Thread thread;
    private boolean running = false;

    // drawing and rendering
    private BufferStrategy bs;
    private Graphics gfx;

    // states
    private State gameState;
    private State menuState;

    //input
    private KeyManager keyManager;

    //debug
    private boolean DEBUG = false;

    /**
     * constructor 
     *  @param String, int, int
     */
    public Game(String title, int width, int height) {
        this.width = width;
        this.height = height;
        this.title = title;
        keyManager = new KeyManager();
    }

    /**
     * Method name: start 
     *  @param void 
     * Description: starts the thread. i. e. starts this calss on a seperate instance
     */
    public synchronized void start() {
        if (running) {
            return;
        } else {
            running = true;
            thread = new Thread(this); // passing this class to start on a separate instance
            thread.start(); // this will call the run method
        }

    }

    /**
     * Method name: run 
     *  @param void 
     * Description: impliments runnable. Class runs on separate thread
     */
    public void run() {
        initialize();  //initialises everything

        int fps = 60; // framerate
        double timePerLoop = 1000000000 / fps; // maximum amount of time allowed for game loop
        double delta = 0; // ammount of time left before main game loop runs again
        long now;
        long lastTime = System.nanoTime();
        long timer = 0; // stores times till 1 secound
        int ticks = 0; // used displays how many tiems loop runs

        // game loop
        while (running) {

            now = System.nanoTime(); // getting amount of current time in nano secounds
            delta += (now - lastTime) / timePerLoop; // time per comman by allowed time for one loop.
            timer += now - lastTime; // time passed since last command
            lastTime = now; // so loop and run again

            if (delta >= 1) {
                update();
                render();

                // resetting timers
                ticks++;
                delta--;

            } // main game loop

            if (timer >= 1000000000) {
                if(DEBUG)
                    System.out.println("Ticks and Frames: " + ticks);

                ticks = 0;
                timer = 0;
            } // frameCount
        }
           stop(); // stops the game
    }


    /**
     * Method name: initialize
     * @param void 
     * Description: initialises the graphics of the game
     */
    private void initialize() {
        display = new Display(title, width, height); // creating a new display
        display.getJFrame().addKeyListener(keyManager);  //adding keyListner to the Jframe
        
        // initialising assets
        Assets.initialize(); 

        // initialising states
        gameState = new GameState(this);
        menuState = new MenuState(this);

        StateManager.setState(gameState); // setting new satte as the gameState
    }

    /**
     * Method name: update 
     *  @param void 
     * Description: updates the positions of stuff
     */
    private void update() {
        keyManager.update();  //updating keys

        if (StateManager.getState() != null) {

            // calling upate method of current state
            StateManager.getState().update();

        } // checks state exists or not

    }

    /**
     * Method name: initialize 
     *  @param void 
     * Description: displays updated objs on the screem
     */
    private void render() {
        bs = display.getCanvas().getBufferStrategy();
        if (bs == null) {
            display.getCanvas().createBufferStrategy(3);
            return;
        }
        gfx = bs.getDrawGraphics();

        // clearing the screen
        gfx.clearRect(0, 0, width, height);

        // DRAW HERE

        if (StateManager.getState() != null) {

            // calling render method of current state
            StateManager.getState().render(gfx);

        } // checks state exists or not

        // END DRAWING
        bs.show(); // swich buffer and show on sceen
        gfx.dispose(); // graphics objects gets done with properly
    }

    
    /**
     * Method name: stop 
     *  @param void
     *  Description: stops the thread. i. e.
     *             stops this calss on the seperate instance it was running on
     * 
     */
    public synchronized void stop() {
        if (running) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            return;
        }
    }

    /**
     * Method name: getKeyManager 
     *  @param void
     * Return Type; KeyManager
     * Description: returns keyManger
     */
    public KeyManager getKeyManager(){
        return keyManager;
    }

}