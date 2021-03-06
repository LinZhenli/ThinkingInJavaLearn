package lowlevel;

import onjava.Nap;

//Simplifying mutexes with the synchronized keyword
public class SynchronizedEvenProducer extends IntGenerator{
    private int currentEvenValue=0;

    @Override
    public synchronized int next() {
        ++currentEvenValue;
        new Nap(0.01);//Cause failure faster
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new SynchronizedEvenProducer());
    }
}
