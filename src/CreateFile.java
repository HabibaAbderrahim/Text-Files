import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateFile {

    public static void CreateFile(String filename){
        File file = new File(filename);
        //check if file exists
        if(!file.exists()){
            //create
            try {
                file.createNewFile();
                //write
                PrintWriter printWriter = new PrintWriter(file);
                printWriter.println("txt txt txt");
                printWriter.println("1000");

                printWriter.close();
            }


            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
