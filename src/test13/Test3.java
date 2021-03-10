package test13;


import java.io.PrintStream;
import java.util.Formatter;

public class Test3 {
    private String name;
    private Formatter f;
    public Test3(String name,Formatter f){
        this.name=name;
        this.f=f;
    }
    public void move(int x,int y){
        f.format("%s The Turtle is at (%d,%d)\n",name,x,y);
    }

    public static void main(String[] args) {
        PrintStream outAlias=System.out;
        Test3 tommy=new Test3("Tommy",new Formatter(System.err));
        Test3 terry=new Test3("Terry",new Formatter(outAlias));
        tommy.move(0,0);
        terry.move(4,8);
        tommy.move(3,4);
        terry.move(2,5);
        tommy.move(3,3);
        terry.move(3,3);
    }
}
