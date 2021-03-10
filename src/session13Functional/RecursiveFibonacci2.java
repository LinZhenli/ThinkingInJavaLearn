package session13Functional;

public class RecursiveFibonacci2 {
    IntCall fib;

    RecursiveFibonacci2() {
        fib = n -> {
            if (n == 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            } else {
                return fib.call(n - 1) + fib.call(n - 2);
            }
        };
    }

        int fibonacci ( int n){
            return fib.call(n);
        }

        public static void main (String[]args){
            RecursiveFibonacci2 rf = new RecursiveFibonacci2();
            for (int i = 0; i <= 10; i++)
                System.out.println(rf.fibonacci(i));
        }

    }
