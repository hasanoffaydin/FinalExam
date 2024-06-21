package File;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FIleOxu {
    public void fileOxu() throws FileNotFoundException {
        try {
            String path = "user.txt";
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line;
            int size = 0;
            int umumiOlcu = 0;
            while((line = reader.readLine())!=null) {
                size += line.length();
                umumiOlcu += line.length();
                System.out.println("Line length : " + size);
                size = 0;
            }
            System.out.println(size);
            System.out.println( "Umumi olcu : " +umumiOlcu);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
