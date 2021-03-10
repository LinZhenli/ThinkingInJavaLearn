package session13Strings;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ReplacingStringTokenizer {
    public static void main(String[] args) {
        String input="But I'm not dead yet! I feel happy!";
        StringTokenizer stoke=new StringTokenizer(input);
        while(stoke.hasMoreElements())
            System.out.print(stoke.nextToken()+" ");
        System.out.println();
        System.out.print(Arrays.toString(input.split(" ")));
        System.out.println();
        Scanner scanner=new Scanner(input);
        while(scanner.hasNext())
            System.out.print(scanner.next()+" ");
    }
}
