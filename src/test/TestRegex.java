package test;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {
    public static void main(String[] args) {
        Pattern pt= Pattern.compile("^(//|/\\*|\\*)");
        Pattern p = Pattern.compile("class +\\w+\\s+");
        Matcher matcher=pt.matcher("(String[] args) {// class Test8 " );
        Matcher matcher2=p.matcher("(String[] args) {// class Test8 " );
        if (matcher2.find()&&!matcher.find())
            System.out.println(matcher2.group());
    }
}
