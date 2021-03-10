package session13Functional;

import java.util.function.IntSupplier;

public class Closure7 {
    IntSupplier makeFun(int x) {
        Integer i = 0;
        i = i + 1;
       // return () -> x + i;
        return ()->x;
    }

}
