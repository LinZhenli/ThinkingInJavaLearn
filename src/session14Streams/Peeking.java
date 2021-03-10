package session14Streams;

public class Peeking {
    public static void main(String[] args) throws Exception {
        FileToWords.stream("D:\\workspace\\ThinkingInJava\\src\\session14Streams\\Cheese.dat")
        .skip(21).limit(4).map(w->w+" ")
        .peek(System.out::print)
        .map(String::toUpperCase)
        .peek(System.out::print)
        .map(String::toLowerCase)
        .forEach(System.out::print);

    }
}
