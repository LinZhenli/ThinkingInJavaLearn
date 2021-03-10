package test;

import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestThreatAnalyzer {
    static String threatData =
            "58.27.82.161@02/10/2005\n" +
                    "204.45.234.40@02/11/2005\n" +
                    "58.27.82.161@02/11/2005\n" +
                    "58.27.82.161@02/12/2005\n" +
                    "58.27.82.161@02/12/2005\n" +
                    "[Next log section with different data format]";

    public static void main(String[] args) {
        String pattern = "(\\d+[.]\\d+[.]\\d+[.]\\d+)@" +
                "(\\d{2}/\\d{2}/\\d{4})";
        Pattern pt = Pattern.compile(pattern);
        Matcher mt = pt.matcher(threatData);
        int j = 0;
        while (mt.find()) {
            // System.out.println(mt.group());
            System.out.println(++j);

            String ip = mt.group(0);
            String date = mt.group(1);
            System.out.format("Threat on %s from %s\n", date, ip);
            //String date = mt.group(2);
        }
//        while(scanner.hasNext(pattern)) {
//            scanner.next(pattern);
//            MatchResult match = scanner.match();
//            String ip = match.group(1);
//            String date = match.group(2);
//            System.out.format("Threat on %s from %s\n", date,ip);
//        }
    }
}
