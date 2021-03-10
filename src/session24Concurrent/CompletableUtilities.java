package session24Concurrent;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableUtilities {
    //Get and show value stored in a CF:
    public static void showr(CompletableFuture<?> c){

        try {
            System.out.println(c.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
    //For CF operations that have no value:
    public static void voidr(CompletableFuture<Void> c){
        try {
            c.get();//Returns void
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
