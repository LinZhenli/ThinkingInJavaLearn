package lowlevel;

import java.util.concurrent.atomic.AtomicInteger;

//Atomic classes: occasionally useful in regular code
public class AtomicEvenProducer extends IntGenerator{
    private AtomicInteger currentEvenValue=
            new AtomicInteger(0);
    @Override
    public int next() {
        return currentEvenValue.addAndGet(2);
    }

    public static void main(String[] args) {
        EvenChecker.test(new AtomicEvenProducer());
    }
}
