package test;

public class TestInner {
    private int i;
    class Inner{
        int k=i;
        private TestInner getInner(){
            int j=i;
            return TestInner.this;
        }


    }
    static class StaticInner{
       // int k=i;
    }

}

