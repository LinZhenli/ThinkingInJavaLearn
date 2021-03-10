package test13;

import util.TextFile;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//args:{Args: = name(of dir or file) "\b[Ssct]\w+"}
public class JGrepTest {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }
        Pattern p =  Pattern.compile(args[1]);
        File file=new File(args[0]);
        if(file.isFile()) {
            //Iterate through the lines of the input file:
            int index = 0;
            Matcher m = p.matcher("");
            for (String line :
                    new TextFile(args[0])) {
                m.reset(line);
                while (m.find())
                    System.out.println(index++ + ": " +
                            m.group() + ": " + m.start());
            }
        }else if(file.isDirectory()){
            File[] files=file.listFiles();
            for (File f:
                 files) {
                int index = 0;
                Matcher m = p.matcher("");
                for (String line :
                        new TextFile(f.getAbsolutePath())) {
                    m.reset(line);
                    while (m.find())
                        System.out.println(index++ + ": " +
                                m.group() + ": " + m.start());
                }
                System.out.println();
            }

        }
    }
}
