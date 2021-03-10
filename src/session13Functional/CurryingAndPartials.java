package session13Functional;

import java.util.function.Function;

public class CurryingAndPartials {
    //δ���ﻯ��
    static String uncurried(String a,String b){
        return a+b;
    }

    public static void main(String[] args) {
        //���ﻯ�ĺ�����
        Function<String,Function<String,String>> sum=a->b->a+b;//[1]
        System.out.println(uncurried("Hi","Ho"));

        Function<String ,String> hi=sum.apply("Hi");//[2]
        System.out.println(hi.apply("Ho"));
        // ����Ӧ��:
        Function<String, String> sumHi =
                sum.apply("Hup ");
        //�����ǵ��κ�������Ϊ��һ�������Ѿ������ȥ�ˡ�
        System.out.println(sumHi.apply("Ho"));
        System.out.println(sumHi.apply("Hey"));


    }
}
