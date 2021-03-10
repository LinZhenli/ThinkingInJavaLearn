package test13;

import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test12 {
    static public final String POEM =
            "Twas brillig, and the slithy toves\n" +
                    "Did gyre and gimble in the wabe.\n" +
                    "All mimsy were the borogoves,\n" +
                    "And the mome raths outgrabe.\n\n" +
                    "Beware the Jabberwock, my son,\n" +
                    "The jaws that bite, the claws that catch.\n" +
                    "Beware the Jubjub bird, and shun\n" +
                    "The frumious Bandersnatch.";

    public static void main(String[] args) {
        Matcher m= Pattern.compile("(^[a-z]w+)|(\\W([a-z]\\w+))").matcher(POEM);
        int i=0;
        Set<String> word=new TreeSet<String>();
        while(m.find()){

            word.add(m.group(m.groupCount()));
            System.out.println(m.start()+" "+(m.end()-1));
        }

        System.out.println(word);
        System.out.println("Count:"+word.size());
//        System.out.println(i);

//        Matcher m = Pattern.compile("(^[a-z]|\\s+[a-z])\\w+").matcher(POEM);
//        Set<String> words = new TreeSet<String>();
//        while(m.find()) {
//            words.add(m.group());
//        }
//        System.out.println("Number of unique non-cap words = " + words.size());
//        System.out.println(words);
    }
}
