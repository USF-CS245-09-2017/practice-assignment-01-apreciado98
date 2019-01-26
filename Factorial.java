public class Factorial {

    public int factorial(int n, String type)
    {
        if(type=="recursive")
        {
            return factorial_recursive(n);
        }
        else if(type=="iterative")
        {
            return factorial_iterative(n);
        }
        //this shouldn't return unless the type is invalid
        return(n);
    }

    //recursive method for factorial
    public int factorial_recursive(int n) {
        if(n==0 || n==1) {
            return 1;
        }
        //does not work for negative numbers
        else if(n<0) {
            try {
                throw new Exception();
            }
            catch (Exception e) {
                System.out.println("Negative number entered");
            }
        }
        //calls recursive method
        return n * factorial_recursive(n-1);
    }

    //iterative method for factorial
    public int factorial_iterative(int n) {
        if(n==0 || n==1) {
            return 1;
        }
        //does not work for negative numbers
        else if(n<0) {
            try {
                throw new Exception();
            }
            catch (Exception e) {
                System.out.println("Negative number entered.");
            }
        }

        int result = 1;

        for(int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}
