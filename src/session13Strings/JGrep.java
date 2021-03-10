package session13Strings;

import util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//D:\workspace\ThinkingInJava\src\session13Strings\JGep.java \b[Ssct]\w+
//A very simple version of the "grep" program.
public class JGrep {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }
        Pattern p = Pattern.compile(args[1]);

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
