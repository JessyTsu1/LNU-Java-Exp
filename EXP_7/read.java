package EXP_7;

import java.io.FileInputStream;
import java.io.IOException;

public class read {
    public void read(String filename){
        try {
            var in = new FileInputStream(filename);
            int b;
            while ((b=in.read())!=-1){
                Process input;
            }
        }
        catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
