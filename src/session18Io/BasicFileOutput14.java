package session18Io;

import java.io.*;

public class BasicFileOutput14 {
    static String file="BasicFileOutput.out";
    static String file2="BasicFileOutput2.out";
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(
                new StringReader(BufferedInputFile.read("D:\\workspace\\ThinkingInJava\\src\\session18Io\\BasicFileOutput.java"))
        );
        LineNumberReader ln=new LineNumberReader(in);
        PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter(file)));
        // int lineCount=1;
        String s;
        long start1=System.nanoTime();
        System.out.println(System.nanoTime());
        while((s=ln.readLine())!=null)
            out.println(ln.getLineNumber()+ ": " + s);
        System.out.println("缓冲写入时间："+(System.nanoTime()-start1));
        out.close();


        //不用缓存
        BufferedReader in2=new BufferedReader(
                new StringReader(BufferedInputFile.read("D:\\workspace\\ThinkingInJava\\src\\session18Io\\BasicFileOutput.java"))
        );
        FileWriter fr=new FileWriter(file2);
        LineNumberReader ln2=new LineNumberReader(in2);
        long start2=System.nanoTime();
        while((s=ln2.readLine())!=null) {
            char []ch=s.toCharArray();
            ln2.getLineNumber();
            for (char c:
                 ch) {
                fr.write(c);
            }
            fr.write("\n");
        }
        System.out.println("无缓冲写入时间："+(System.nanoTime()-start2));
        fr.close();
        System.out.print(BufferedInputFile.read(file2));
        //Show the stored file:
       // System.out.println(BufferedInputFile.read(file));

    }
}
