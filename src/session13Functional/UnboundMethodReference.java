package session13Functional;

class X {
    int i=5;
    String f() { return "X::f()"+i; }
}

interface MakeString {
    String make();
}

interface TransformX {
    String transform(X x);
}

public class UnboundMethodReference {
    public static void main(String[] args) {
        // MakeString ms = X::f; // [1]
        TransformX sp = X::f;
        X x = new X();
//        MakeString ms = x::f;
//        System.out.println(ms.make());//这样也可以
        System.out.println(sp.transform(x)); // [2]
        System.out.println(x.f()); // 同等效果
    }
}

