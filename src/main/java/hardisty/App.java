package hardisty;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        println("" + EulerOneImperative());
        println("" + EulerTwoImperative());
    }
/**
    Multiples of 3 and 5
    Problem 1
    If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
    The sum of these multiples is 23.

    Find the sum of all the multiples of 3 or 5 below 1000.
 */
    public static int EulerOneImperative() {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if (isMultiple(i, 3)) {
                sum += i;
            } else if  (isMultiple(i, 5)) {
                sum += i;
            }
        }

        return sum;
    }

    /**
    Each new term in the Fibonacci sequence is generated by adding the previous two terms.
     By starting with 1 and 2, the first 10 terms will be:

        1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

    By considering the terms in the Fibonacci sequence whose values do not exceed four million,
     find the sum of the even-valued terms.
    */

    public static long EulerTwoImperative() {
        long sum = 0;

        int max = 4000000;
        int firstArg = 0;
        int secondArg = 1;
        int fib;
        while (secondArg < max) {
            fib = firstArg + secondArg;
            if (fib % 2 == 0) {
                sum += fib;
            }


            print(firstArg);
            print(", ");
            print(secondArg);
            print(", ");

            println(sum);
            firstArg = secondArg;
            secondArg = fib;
        }

        return sum;
    }
    /**
    The prime factors of 13195 are 5, 7, 13 and 29.

    What is the largest prime factor of the number 600851475143 ?
    */
    public static int fib(int n) {
        int sum = 0;
        int firstTerm = 0;
        int secondTerm = 1;
        for (int i = 0; i < n; i++) {
            sum = firstTerm + secondTerm;
        }
        return sum;
    }

    public static boolean isMultiple(int n, int divisor) {
        if (n % divisor == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void print(String s) {
        System.out.print(s);
    }
    public static void print(int s) {
        System.out.print(s);
    }

    public static void println(String s) {
        System.out.println(s);
    }
    public static void println(long s) {
        System.out.println(s);
    }
}
