package test;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class TestSystemIn {
    public static void main(String[] args) throws IOException {
//        InputStream is=System.in;
//        int j;
//        while((j=is.read())!=-1){
//            System.out.print((char)j);
//        }

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("输入的int数字是："+num);

    }
}
