package test13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test10 {
    static String[] s={"Java now has regular expressions","^Java","\\breg.*","lar\\B","n.w\\s+h(a|i)s","s?","s+",
            "s{4}","s{1}","s{0,3}"};
    public static void main(String[] args) {

        if (s.length < 2) {
            System.out.println("Usasge:\njava TestRegularExpression " + "characterSequence regularExpression+");
            System.exit(0);
        }
        System.out.println("Input:\"" + s[0] + "\"");
        for (String arg :
                s) {
            System.out.println("Regular expression:\"" + arg + "\"");
            Pattern p = Pattern.compile(arg);

            Matcher m = p.matcher(s[0]);
            while (m.find()) {
                System.out.println("Match \"" + m.group() + "\" at positions " +
                        m.start() + "-" + (m.end() - 1));
            }

        }

    }
}
