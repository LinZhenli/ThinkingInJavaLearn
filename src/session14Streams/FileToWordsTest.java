package session14Streams;


public class FileToWordsTest {
    public static void main(String[] args) throws Exception {
        FileToWords.stream("D:\\workspace\\ThinkingInJava\\src\\session14Streams\\Cheese.dat")
                .limit(7)
                .forEach(s -> System.out.format("%s ", s));
        System.out.println();
        FileToWords.stream("D:\\workspace\\ThinkingInJava\\src\\session14Streams\\Cheese.dat")
                .skip(7)
                .limit(2)
                .forEach(s -> System.out.format("%s ", s));

    }
}
