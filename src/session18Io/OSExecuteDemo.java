package session18Io;

import util.OSExecute;

public class OSExecuteDemo {
    public static void main(String[] args) {
        OSExecute.command("javap D:\\workspace\\out\\production\\ThinkingInJava\\session18Io\\OSExecuteDemo.class");
        System.out.println(Integer.SIZE);
    }
}
