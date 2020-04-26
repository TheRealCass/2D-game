import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Class Name: Utilities
 * Methods: loadFileAsString
 * Description: random methods to used in came
 * 
 * author @Brown_Buddah
 * version(4/26/2020)
 */
public class Utilities {

    /**
     * Name: ParseInt
     * @param String
     * @return string of whatever is in file
     */
    public static String loadFileAsString(String path){
        StringBuilder builder = new StringBuilder(); //to attatch characters to a string
        try {
            BufferedReader scan = new BufferedReader(new FileReader(path));  //scanning the text
            String line;  //to store each line
            while((line = scan.readLine()) != null){
                builder.append(line + "\n");

                scan.close();
            }//runs as long as there is a next line

        } catch (Exception e) {

            e.printStackTrace();  //prints errors

        }//to catch errors

        return builder.toString();// retuns the whole thing as a string
    }

    /**
     * Name: ParseInt
     * @param int
     * @return string as a number from string
     */
    public static int parseInt(String number){
        try {
            Integer.parseInt(number);
        } catch (NumberFormatException e) {
            e.printStackTrace();  //print error to screen
            return 0;  //so method dosent crash

        }//cathing anything that isnt a numebr
    }
}