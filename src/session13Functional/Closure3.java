package session13Functional;

import java.util.function.IntSupplier;

public class Closure3 {
    IntSupplier makeFun(int x) {
        int i = 0;
        // x++ �� i++ ���ᱨ��
       // return () -> x++ + i++;
        return ()->x+i;//x��i�������Լ��䣬����ʽ��final


    }

}
