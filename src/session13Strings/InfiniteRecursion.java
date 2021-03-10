package session13Strings;

import java.util.ArrayList;
import java.util.List;

//Accidental recursion.
public class InfiniteRecursion {
    //StackOverflowError
//    @Override
//    public String toString() {
//        return "InfiniteRecursion address:"+this+"\n";
//    }

    //repair

    @Override
    public String toString() {

        return super.toString();
    }

    public static void main(String[] args) {
        List<InfiniteRecursion> v=new ArrayList<InfiniteRecursion>();
        for(int i=0;i<10;i++)
            v.add(new InfiniteRecursion());
        System.out.println(v);
    }
}
