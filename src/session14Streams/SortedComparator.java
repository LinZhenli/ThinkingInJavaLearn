package session14Streams;

import java.util.Comparator;

public class SortedComparator {
    public static void main(String[] args) throws Exception {
        FileToWords.stream("D:\\workspace\\ThinkingInJava\\src\\session14Streams\\Cheese.dat")
.skip(10).limit(10).sorted(Comparator.reverseOrder()).map(w->w+" ")
                .forEach(System.out::print);
    }
}

