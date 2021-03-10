package test;

public class Recursive {
    public static void main(String[] args) {
        System.out.println(sum(100));
        System.out.println(factorial(10));
        System.out.println(fibonacci(4));

    }
    public static int sum(int i){//Ei
        if(i==1)
            return 1;

        return
                i+sum(--i);
    }

    public static long factorial(long n){//n!
        if(n==1)
            return 1;
        return
                n*factorial(--n);
    }

    public static int fibonacci(int n){//f(n)=f(n-1)+f(n-2)
        if(n<2)
            return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
