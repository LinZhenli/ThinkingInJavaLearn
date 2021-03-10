package session14Streams;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class OptionalsTest {
    static void basics(Optional<String> optString){
        if(optString.isPresent())
            System.out.println(optString.get());
        else
            System.out.println("Nothing inside!");
    }

    static void ifPresent(Optional<String> optString){
        optString.ifPresent(System.out::println);
    }

    static void orElse(Optional<String> optString){
        System.out.println(optString.orElse("Nada"));
    }

    static void orElseGet(Optional<String> optString){
        System.out.println(optString.orElseGet(()->"Generated"));
    }

    static void orElseThrow(Optional<String> optString){
        try {
            System.out.println(optString.orElseThrow(()->new Exception("Supplied")));
        }catch (Exception e){
            System.out.println("Caught"+e);
        }
    }

    static void test(String testName, Consumer<Optional<String>> cos){
        System.out.println("==="+testName+"===");
        cos.accept(Stream.of("Epithets").findFirst());
        cos.accept(Stream.<String>empty().findFirst());
    }

    public static void main(String[] args) {
//        test("basics", OptionalsTest::basics);
//        test("ifPresent", OptionalsTest::ifPresent);
//        test("orElse", OptionalsTest::orElse);
//        test("orElseGet", OptionalsTest::orElseGet);
//        test("orElseThrow", OptionalsTest::orElseThrow);
        Optional<String> epithets = Stream.of("Epithets").findFirst();
        Optional<String> first = Stream.<String>empty().findFirst();
        basics(epithets);
        basics(first);



    }
}
