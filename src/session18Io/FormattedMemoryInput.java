package session18Io;

import javax.xml.crypto.Data;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

public class FormattedMemoryInput {
    public static void main(String[] args) throws IOException {
        try{
            DataInputStream in=new DataInputStream(new ByteArrayInputStream(
                    BufferedInputFile.read("D:\\workspace\\ThinkingInJava\\src\\session18Io\\FormattedMemoryInput.java").getBytes()));
            while(true)
 //           while(in.available()!=0)
                System.out.print((char)in.readByte());
        } catch (EOFException e) {
            System.err.println("End of stream");
        }
    }
}
