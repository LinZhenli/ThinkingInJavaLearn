package test18;

import util.BinaryFile;
import util.Directory;
import util.PPrint;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test20 {
    public static void main(String[] args) throws IOException {
        List<File> af=Directory.walk(".",".+\\.class").files;
       // System.out.println(PPrint.pformat(af));
        byte[] b={(byte) 0xCA,(byte) 0XFE,(byte) 0XBA,(byte) 0XBE};
        for (File f:
             af) {
            byte[]a=BinaryFile.read(f);
            for(int i=0;i<4;i++)
            {
                if(a[i]!=b[i]) {
                    System.out.println("Wrong class:"+f);
                    System.exit(0);
                }
            }

        }
    }
}
