package session18Io;

import java.io.*;
//把本文件读入并输出
public class BasicFileOutput {
    static String file="D:\\workspace\\properties\\a.txt";

    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(
          new StringReader(BufferedInputFile.read("D:\\workspace\\ThinkingInJava\\src\\session18Io\\BasicFileOutput.java"))
        );
        PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter(file)));
        int lineCount=1;
        String s;
        while((s=in.readLine())!=null)
            out.println(lineCount++ + ": " + s);
        out.close();
        //Show the stored file:
        System.out.println(BufferedInputFile.read(file));

    }
}

