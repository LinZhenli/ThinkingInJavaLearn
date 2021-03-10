package session18Io;

import util.Directory;
import util.PPrint;

import java.io.File;

//Sample use of Directory utilities
public class DirectoryDemo {
    public static void main(String[] args) {
        //All directories:
        PPrint.pprint(Directory.walk("D:\\workspace\\ThinkingInJava\\src").dirs);
        for (File file:
             Directory.local("D:\\workspace\\ThinkingInJava\\src\\test","T.*")) {
            System.out.println(file);
        }
        System.out.println("----------------");
        //All Java files beginning with 'T';
        for(File file:Directory.walk(".","T.*\\.java"))
            System.out.println(file);
        System.out.println("=================");
        //Class files containing "Z" or "z";
        for (File file :
                Directory.walk(".",".*[Zz].*\\.class")) {
            System.out.println(file);
        }
    }
}
