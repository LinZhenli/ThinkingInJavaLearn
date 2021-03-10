package test;

public class InterfaceTest implements Chuli{
    public static void main(String[] args) {
        useChuli(new InterfaceTest());
        System.out.println(sb);
    }
   static StringBuilder sb=new StringBuilder();
   static void useChuli(Chuli chuli){
        chuli.build(sb);
    }
    @Override
    public void build(StringBuilder s) {
        s.append("hello");
    }
}

interface Chuli{
    void build(StringBuilder s);

}

interface ChuliI extends Chuli{
    @Override
    void build(StringBuilder s);
}