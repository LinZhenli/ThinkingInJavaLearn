package session13Functional;

import java.util.function.Function;

public class CurryingAndPartials {
    //未柯里化：
    static String uncurried(String a,String b){
        return a+b;
    }

    public static void main(String[] args) {
        //柯里化的函数：
        Function<String,Function<String,String>> sum=a->b->a+b;//[1]
        System.out.println(uncurried("Hi","Ho"));

        Function<String ,String> hi=sum.apply("Hi");//[2]
        System.out.println(hi.apply("Ho"));
        // 部分应用:
        Function<String, String> sumHi =
                sum.apply("Hup ");
        //下面是单参函数，因为第一个参数已经传入进去了。
        System.out.println(sumHi.apply("Ho"));
        System.out.println(sumHi.apply("Hey"));


    }
}
