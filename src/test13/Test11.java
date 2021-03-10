package test13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test11 {

    static String[] s = {"Arline ate eight apples and one orage while Anita hadn't any",
            "((?i)(^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\b"};

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
