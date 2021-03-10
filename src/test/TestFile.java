package test;

import java.io.File;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) throws IOException {
        File file=new File("123");
        System.out.println(file.getCanonicalFile());
    }
}
