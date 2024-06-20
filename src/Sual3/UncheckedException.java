package Sual3;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UncheckedException {
    public void read() throws FileNotFoundException {
        try (BufferedReader reader = new BufferedReader(new FileReader("user.txt"))){
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("Bu kod her zmaan isleyecek :)");
        }
    }

}
