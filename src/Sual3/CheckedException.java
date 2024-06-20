package Sual3;

import java.io.FileWriter;
import java.io.IOException;

public class CheckedException {
    public void add() throws IOException {
        String value = "Salam dunya";
        FileWriter fileWriter = new FileWriter("user.txt",true);
        fileWriter.write(value);
        fileWriter.close();
    }
}
