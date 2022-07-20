import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyFile {

    public static void ReadFile(){
        BufferedReader bufferedReader = null;

        try {


            bufferedReader = new BufferedReader(new FileReader("myFile.txt"));
            String line ;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
