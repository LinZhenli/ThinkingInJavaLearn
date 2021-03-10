package session13Functional;

import java.util.function.Consumer;

public class TestAddThen {
    public static void main(String[] args) {
        String[] arr={"�����Ȱͣ�Ů","����������Ů","�����������"};
        printInfo(arr,message->{String name=message.split("��")[0];
            System.out.print("������"+name);},message->{
            String age=message.split("��")[1];
            System.out.println("�����䣺"+age+"��");
        });
    }

    public static void printInfo(String[] arr, Consumer<String> con1,Consumer<String> con2){
        for (String message : arr) {
            con1.andThen(con2).accept(message);
        }
    }

}
