package session18Io;

import java.io.*;
import java.nio.Buffer;

public class BufferedInputFile {
    //Throw exceptions to console:
    public static String read(String filepath) throws IOException {
        BufferedReader bf=new BufferedReader(new FileReader(new File(filepath)));
        String s;
        StringBuilder  sb=new StringBuilder();
        while((s=bf.readLine())!=null)
            sb.append(s+ "\n");
        bf.close();
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(read("ThinkingInJava\\src\\session18Io\\BufferedInputFile.java"));
        System.out.println(new File("ThinkingInJava\\src\\session18Io\\BufferedInputFile.java").getAbsolutePath());
    }
}
