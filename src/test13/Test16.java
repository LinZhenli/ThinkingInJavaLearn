package test13;

import util.TextFile;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test16 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }
        Pattern p = null;
        if (args.length == 2)
            p = Pattern.compile(args[1]);
        if (args.length > 2) {
            switch (args[2]) {
                case "Pattern.CASE_INSENSITIVE":
                    p = Pattern.compile(args[1], Pattern.CASE_INSENSITIVE);
                    System.out.println("Pattern.CASE_INSENSITIVE");
                    break;
                case "Pattern.MULTILINE":
                    p=Pattern.compile(args[1], Pattern.MULTILINE);
                    System.out.println("Pattern.MULTILINE");
                    break;
                default:
                    p = Pattern.compile(args[1]);
            }
            if(args.length>3){
                File file=new File(args[3]);
                if( file.isDirectory()) {
                    File[] files=new File(".").listFiles();
                }
            }
        }
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
    }
}
