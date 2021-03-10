package session14Streams;

import java.util.Arrays;

public class ArrayStreams {
    public static void main(String[] args) {
        Arrays.stream(new double[]{3.1159,2.718,1.618})
                .forEach(n->System.out.format("%f",n));
        System.out.println();

        Arrays.stream(new int[]{1,3,5}).forEach(n->System.out.format("%d",n));
        System.out.println();
        Arrays.stream(new long[] { 11, 22, 44, 66 })
                .forEach(n -> System.out.format("%d ", n));
        System.out.println();

        // ѡ��һ������:
        Arrays.stream(new int[] { 1, 3, 5, 7, 15, 28, 37 }, 3, 6)
                .forEach(n -> System.out.format("%d ", n));


    }
}
