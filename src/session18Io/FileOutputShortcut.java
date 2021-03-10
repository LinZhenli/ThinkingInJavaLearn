package session18Io;

import util.Print;

import java.io.*;

public class FileOutputShortcut {//���Ļ�������
    static String file="properties\\a.txt";

    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new StringReader(BufferedInputFile.read("D:\\workspace\\ThinkingInJava\\src\\session18Io\\FileOutputShortcut.java")));
        //Here's the shortcut:
        PrintWriter out=new PrintWriter(file);
        int lineCount=1;
        String s;
        while ((s=in.readLine())!=null)
            out.println(lineCount++ +": "+s);
        out.println("���ᰡ");
        out.close();
        //Show the stored file:
        System.out.println(BufferedInputFile.read(file));
    }
}
