package session13Strings;

import session15Generics.coffee.Coffee;
import session15Generics.coffee.CoffeeGenerator;

import java.util.ArrayList;

public class ArrayListDisplay {
    public static void main(String[] args) {
        ArrayList<Coffee> coffees=new ArrayList();
        for (Coffee c :
                new CoffeeGenerator(10)) {
            coffees.add(c);
        }
        System.out.println(coffees);
    }
    
}
