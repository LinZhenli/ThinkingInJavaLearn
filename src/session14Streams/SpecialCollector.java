package session14Streams;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class SpecialCollector {
    public static void main(String[] args) throws Exception {
        ArrayList<String> words=FileToWords.stream("D:\\workspace\\ThinkingInJava\\src\\session14Streams\\Cheese.dat")
                .collect(ArrayList::new,
                        ArrayList::add,
                        ArrayList::addAll);
        words.stream()
                .filter(s->s.equals("cheese"))
                .forEach(System.out::println);
    }
}
