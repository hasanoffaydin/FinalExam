package File;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileYaz {
    public void faylYaz() throws FileNotFoundException {
        try {
            String path = "user.txt";
            FileWriter fileWriter = new FileWriter(path,true);
            fileWriter.write("Salam Men Aydin Hesenov Baki Muhendislik Universitetinin telebesiyem");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
