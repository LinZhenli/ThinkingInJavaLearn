package lowlevel;

import onjava.Nap;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//Preventing thread collisions with mutexes
public class MutexEvenProducer extends IntGenerator{
    private int currentEvenValue=0;
    private Lock lock=new ReentrantLock();

    @Override
    public int next() {
        lock.lock();
        try {
            ++currentEvenValue;
            new Nap(0.01);//cause failure faster
            ++currentEvenValue;
            return currentEvenValue;
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        EvenChecker.test(new MutexEvenProducer());
    }
}
