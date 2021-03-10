package session13Functional;

import java.util.function.Consumer;

public class TestAddThen2 {
    public static void main(String[] args) {
        String[] arr={"迪丽热巴，女","古力娜扎，女","马尔扎哈，男"};
        printInfo(arr);
    }

    public static void printInfo(String[] arr){
        for (String message : arr) {
            String name=message.split("，")[0];
            String age=message.split("，")[1];
            System.out.println("姓名："+name+"。年龄："+age+"。");
        }
    }

}
