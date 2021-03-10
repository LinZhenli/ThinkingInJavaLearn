package test18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test21 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s=null;
        while((s=bf.readLine())!=null)
            System.out.println(s.toUpperCase());
    }
}
