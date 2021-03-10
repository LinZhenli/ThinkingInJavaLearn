package session14Streams;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class OptionalMap {
    static String[] elements={"12","","23","45"};
    static Stream<String> testStream() {
        return Arrays.stream(elements);
    }

    static void test(String descr, Function<String,String> func){
        System.out.println("---ги"+descr+")---");
        for (int i = 0; i < elements.length; i++) {
            System.out.println(
                    testStream()
                    .skip(i)
                    .findFirst()
                    .map(func)
            );
        }
    }

    public static void main(String[] args) {
        //If Optional is not empty,map() first extracts
        //the contents which it then passes
        //to the function:
        test("Add brackets",s->"["+s+"]");
    }
}
