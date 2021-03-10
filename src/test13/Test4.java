package test13;

import java.util.Formatter;

public class Test4 {
    public static void main(String[] args) {
        Formatter fm=new Formatter(System.out);
       // fm.format("%-12.12d\n%c,%b,%s,%f,%e,%x,%h", 12, 'a',true,"hello",12.3,12.4,155,fm.hashCode());
        fm.format("%-12d%c,%b,%-12.12s,%f,%e,%x,%h", 12, 'a',true,"hello",12.3,12.4,155,fm.hashCode());
    }
}
