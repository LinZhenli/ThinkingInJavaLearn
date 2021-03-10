package test18;

import session18Io.BufferedInputFile;

import java.io.*;

public class BasicFileOutput13 {
    static String file="BasicFileOutput.out";

    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(
                new StringReader(BufferedInputFile.read("D:\\workspace\\ThinkingInJava\\src\\session18Io\\BasicFileOutput.java"))
        );
        LineNumberReader ln=new LineNumberReader(in);
        PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter(file)));
       // int lineCount=1;
        String s;
        while((s=ln.readLine())!=null)
            out.println(ln.getLineNumber()+ ": " + s);
        out.close();
        //Show the stored file:
        System.out.println(BufferedInputFile.read(file));

    }
}