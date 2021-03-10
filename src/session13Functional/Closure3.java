package session13Functional;

import java.util.function.IntSupplier;

public class Closure3 {
    IntSupplier makeFun(int x) {
        int i = 0;
        // x++ 和 i++ 都会报错：
       // return () -> x++ + i++;
        return ()->x+i;//x和i都不能自己变，是隐式的final


    }

}
