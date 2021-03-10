package test18;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Test12 {
    List<String> ls=new LinkedList<String>();
    Test12(String filepath) throws IOException {
        ls=read(filepath);
    }

    Test12(String filepath,String word) throws IOException {
        ls=read(filepath,word);
    }
    public  List<String> read(String filepath) throws IOException {
        BufferedReader bf=new BufferedReader(new FileReader(new File(filepath)));
        String s;
        StringBuilder  sb=new StringBuilder();
        int i=1;
        while((s=bf.readLine())!=null)
            ls.add(i+++": "+s);
        bf.close();
        return ls;
    }

    public  List<String> read(String filepath,String word) throws IOException {
        BufferedReader bf=new BufferedReader(new FileReader(new File(filepath)));
        String s;
        StringBuilder  sb=new StringBuilder();
        while((s=bf.readLine())!=null)
        {
            if(s.contains(word))
                ls.add(s);
        }

        bf.close();
        return ls;
    }
    public void print(){
        for (int i=ls.size()-1;i>=0;i--){
            System.out.println(ls.get(i));
        }
    }

    public static void main(String[] args) throws IOException {
        if(args.length!=1){
            System.err.println("please input a flie!");
            System.exit(0);
        }
        new Test12(args[0]).print();
    }


}
