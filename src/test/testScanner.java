package test;

import org.junit.Test;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class testScanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            String s = in.next();
            System.out.println(s);
        }
    }

    /**
     * 读文件
     *
     * @throws IOException
     */
    @Test
    public void scannerFile() throws IOException {
        Scanner in = new Scanner(Paths.get("test.txt"), "utf-8");
        while (in.hasNext()) {
            System.out.println(in.nextLine());
        }
    }

    /**
     * 写文件
     *
     * @throws IOException
     */
    @Test
    public void printWriterFile() throws IOException {
        PrintWriter out = new PrintWriter("/a.txt", "UTF-8");
        out.print("hello,motto");
        out.close();

    }

    @Test
    public void scannerInput() throws IOException {
        System.out.println(System.getProperty("user.dir"));
    }


}
