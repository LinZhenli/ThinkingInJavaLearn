package session14Streams;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Informational {
    public static void main(String[] args) throws Exception {
        System.out.println(FileToWords.stream(
                "D:\\workspace\\ThinkingInJava\\src\\session14Streams\\Cheese.dat")
        .count());
        System.out.println(FileToWords.stream(
                "D:\\workspace\\ThinkingInJava\\src\\session14Streams\\Cheese.dat")
                .min(String.CASE_INSENSITIVE_ORDER).orElse("NONE"));
        System.out.println( FileToWords.stream("D:\\workspace\\ThinkingInJava\\src\\session14Streams\\Cheese.dat")
                .max(String.CASE_INSENSITIVE_ORDER)
                .orElse("NONE")
        );
    }
}
