import java.io.BufferedReader;
import java.io.FileReader;

public class Utilities {

    public static String loadFileAsString(String path){
        StringBuilder builder = new StringBuilder();
        try {
            BufferedReader scan = new BufferedReader(new FileReader(path));
            String line;
            while((line = scan.readLine()) != null){
                builder.append(line + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}