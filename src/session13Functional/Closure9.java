package session13Functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Closure9 {
    Supplier<List<Integer>> makeFun() {
        List<Integer> ai = new ArrayList<>();
        ai = new ArrayList<>(); // Reassignment
       // return () -> ai;//����
        return ()->new ArrayList<>();
    }

}
