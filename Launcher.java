/**
 * Class Name: Launcher
 * Methods:
 * Description: starts the game
 * 
 * author @Brown_Buddah
 * version(4/18/2020)
 */
public class Launcher{
    public static void main(String[] args) {
        Game game = new Game("My Game", 640, 360);
        game.start();
    }

}