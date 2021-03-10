package session18Io;

import java.io.*;

//Testing for end of file while reading a byte at a time.
public class TestEOF {
    public static void main(String[] args) throws IOException {
        DataInputStream in=new DataInputStream(new BufferedInputStream
                (new FileInputStream("D:\\workspace\\ThinkingInJava\\src\\session18Io\\TestEOF.java")));
        while(in.available()!=0)
            System.out.print((char)in.readByte());
    }
}
