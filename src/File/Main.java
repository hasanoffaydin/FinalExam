package File;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileYaz fileYaz = new FileYaz();
        fileYaz.faylYaz();
        FIleOxu fIleOxu = new FIleOxu();
        fIleOxu.fileOxu();
    }
}
