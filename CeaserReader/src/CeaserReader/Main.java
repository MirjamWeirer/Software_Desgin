package CeaserReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader = new FileReader(new File("geheim.txt"));
        CeaserReader reader = new CeaserReader(fileReader, 9);
        int i ;

        try {
            while ((i = reader.read()) >= 0) {
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
