package session13Functional;


import java.util.function.Function;

@FunctionalInterface
interface  Functional{
    String goodbye(String arg);
   // String hello(String arg);
}

interface FunctionalNoAnn{
    String goodbye(String arg);
}

/*
@FunctionalInterface
interface NotFunctional {
  String goodbye(String arg);
  String hello(String arg);
}
����������Ϣ:
NotFunctional is not a functional interface
multiple non-overriding abstract methods
found in interface NotFunctional
*/


public class FunctionalAnnotation {
    public String goodbye(String arg){
        return  "Goodbye, "+arg;
    }

    public static void main(String[] args) {
        FunctionalAnnotation fa=new FunctionalAnnotation();
        Functional f=fa::goodbye;
        FunctionalNoAnn fna=fa::goodbye;
        Functional fl=a->"Goodbye,"+a;
        FunctionalNoAnn fnal=a->"Goodbye,"+a;
        System.out.println(f.goodbye("you"));
        System.out.println(fna.goodbye("you"));
        System.out.println(fl.goodbye("you"));
        System.out.println(fnal.goodbye("you"));
    }
}
