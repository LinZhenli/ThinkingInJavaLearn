package session13Functional;

import java.util.function.IntSupplier;

public class Closure5 {
    IntSupplier makeFun(int x) {
        int i = 0;
        i++;
        x++;
       // return () -> x + i;
        return ()->1;
    }
}