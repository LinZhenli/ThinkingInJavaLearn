package session13Functional;

import java.util.function.Consumer;

public class TestAddThen2 {
    public static void main(String[] args) {
        String[] arr={"�����Ȱͣ�Ů","����������Ů","�����������"};
        printInfo(arr);
    }

    public static void printInfo(String[] arr){
        for (String message : arr) {
            String name=message.split("��")[0];
            String age=message.split("��")[1];
            System.out.println("������"+name+"�����䣺"+age+"��");
        }
    }

}
