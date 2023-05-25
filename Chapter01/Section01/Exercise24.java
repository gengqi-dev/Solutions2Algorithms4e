/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Chapter01.Section01;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise24 {
    public static void main(String[] args) {
        int result = gcd(24, 105);
        StdOut.printf("Result: %d", result);
        int[] data = StdIn.readAllInts();
        if (data.length == 2) {
            StdOut.printf("Result: %d", gcd(data[0], data[1]));
        }
        else {
            StdOut.println("Input error.");
        }
    }

    private static int gcd(int a, int b) {
        StdOut.printf("%d,%d\n", a, b);
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}
