package lowlevel;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SwallowedException {
    public static void main(String[] args) {
        ExecutorService exec= Executors.newSingleThreadExecutor();
        exec.submit(()->{throw new RuntimeException();});
        exec.shutdown();
    }
}
