package lowlevel;
//When threads collide
public class EvenProducer extends IntGenerator{
    private int currentEvenValue=0;
    @Override
    public int  next() {
        ++currentEvenValue;//[1]
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new EvenProducer());
    }
}
