package test;

import java.util.Objects;

public class Equals {
    public static void main(String[] args) {
        System.out.println(Objects.equals(null,"SnailClimb"));
        Integer i=new Integer(5);
        Integer i2=new Integer(5);
        System.out.println(i==i2);
    }
}
