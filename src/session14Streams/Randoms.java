package session14Streams;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Random;

public class Randoms {
    public static void main(String[] args) {
        new Random(47)
                .ints(5,20)
                .distinct()
                .limit(7)
                .sorted()
                .forEach(System.out::println);
    }
}
