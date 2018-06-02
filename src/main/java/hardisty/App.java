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
        print("" + EulerOneImperative());
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

    public static boolean isMultiple(int n, int divisor) {
        if (n % divisor == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void print(String s) {
        System.out.println(s);
    }
}
