package session18Io;// io/Ex21.java
// TIJ4 Chapter IO, Exercise 21, page 942
/* Write a program that takes standard input and capitalizes all
 * characters, then puts the results on standard output. Redirect
 * the contents of a file into this program (the process of redirection
 * will vary dependign on your operating system).
 */

/* My solution to one of the exercises in
 * Thinking in Java 4th Edition (by Bruce Eckel).
 * It compiles and runs correctly using JDK 1.6.0
 * @author Greg Gordon
 * @author www.greggordon.org
 * March, 2008
 */

import java.io.*;

public class Ex21 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\workspace\\ThinkingInJava\\src\\session18Io\\Ex21.java");
        BufferedInputStream inFile =
                new BufferedInputStream(new
                        FileInputStream(file));
        BufferedReader bf=new BufferedReader(new FileReader(new File("D:\\workspace\\ThinkingInJava\\src\\session18Io\\Ex21.java")));//这个有什么不同？？
        String s;
        while((s = bf.readLine()) != null)
            System.out.println(s.toUpperCase());
        System.setIn(inFile);//
        BufferedReader stdin = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("--------------------");

        while((s = stdin.readLine()) != null)
            System.out.println(s.toUpperCase());
    }
}