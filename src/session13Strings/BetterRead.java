package session13Strings;

import java.util.Scanner;

public class BetterRead {
    public static void main(String[] args) {
        Scanner stdin=new Scanner(SimpleRead.input);//"Sir Robin of Camelot\n22 1.61803"
        System.out.println("What is your name?");

        String name=stdin.nextLine();
        System.out.println(name);
        System.out.println(
                "How old are you? What is your favorite double?");
        System.out.println("input:<age><double>");
        int age=stdin.nextInt();
        double favorite=stdin.nextDouble();
        System.out.println(age);
        System.out.println(favorite);
        System.out.format("Hi %s.\n",name);
        System.out.format("In 5 years you will be %d.\n",age+5);
        System.out.format("My favorite double is %f.",favorite/2);
    }
}
