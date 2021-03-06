package test18;// io/Ex20.java
// TIJ4 Chapter IO, Exercise 20, page 941
// Using Directory.walk() and BinaryFile, verify that all .class files 
// in a directory tree begin with the hex characters 'CAFEBABE'.

/* My solution to one of the exercises in
 * Thinking in Java 4th Edition (by Bruce Eckel).
 * It compiles and runs correctly using JDK 1.6.0
 * @author Greg Gordon
 * @author www.greggordon.org
 * March, 2008
 */

import util.BinaryFile;
import util.Directory;

import java.io.*;


public class Ex20 {
    public static void main(String[] args) throws IOException {
        for(File file : Directory.walk(".", ".*\\.class").files) {
            byte[] ba = BinaryFile.read(file);
            for(int i = 0; i < 4; i++)
                System.out.println((Integer.toHexString(ba[i]& 0xff ).toUpperCase()));
            System.out.println();
        }
    }
}