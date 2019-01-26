public class Fibonacci {

    public int fibonacci(int n, String type)
    {
        if(type=="recursive")
        {
            return fibonacci_recursive(n);
        }
        else if(type=="iterative")
        {
            return fibonacci_iterative(n);
        }
        //this shouldn't return unless the type is invalid
        return(n);
    }

    //recursive method for fibonacci
    public int fibonacci_recursive(int n) {
        if(n==0 || n==1) {
            return n;
        }
        //calls the recursive method
        return fibonacci_recursive(n-1)+fibonacci_recursive(n-2);
    }

    //iterative method for fibonacci
    public int fibonacci_iterative(int n) {
        if(n==0 || n==1) {
            return n;
        }
        int fib = 1;
        int temp = 1;
        int x = 1;
        for (int i = 0; i<n; i++) {
            fib = temp;
            temp = x;
            x = fib + temp;
        }
        return fib;
    }
}
