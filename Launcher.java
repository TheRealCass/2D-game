/**
 * Class Name: Launcher
 * Methods:
 * Description: starts the game
 * 
 * author @Brown_Buddah
 * version(05/07/2020)
 */
public class Launcher{
    public static void main(String[] args) {
        Game game = new Game("My Game", 640, 360);
        game.start();
    }

}