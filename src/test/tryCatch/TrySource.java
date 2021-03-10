package test.tryCatch;

import java.io.*;

public class TrySource {
    public static void main(String[] args) {
        try (BufferedInputStream bin = new BufferedInputStream(new FileInputStream(new File("a.txt")));
             BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(new File("out.txt")))) {
            int b;
            while ((b = bin.read()) != -1) {
                bout.write(b);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
