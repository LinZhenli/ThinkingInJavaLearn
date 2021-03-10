package session24Concurrent;

import onjava.Nap;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class SingleThreadExecutor2 {
    public static void main(String[] args) {
        ExecutorService exec= Executors.newSingleThreadExecutor();
        IntStream.range(0,10)
                .mapToObj(NapTask::new)
                .forEach(exec::execute);
        System.out.println("All tasks submitted");
        exec.shutdown();

//            System.out.println(
//                    Thread.currentThread().getName()+" awaiting termination"
//            );
//            new Nap(0.1);

    }
}
