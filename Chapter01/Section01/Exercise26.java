/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Chapter01.Section01;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise26 {
    public static void main(String[] args) {
        int[] data = StdIn.readAllInts();
        if (data.length != 3)
            return;
        int a = data[0];
        int b = data[1];
        int c = data[2];
        int t = 0;
        // a is smaller than b with this code
        if (a > b) {
            t = a;
            a = b;
            b = t;
        }
        // a is smaller than c with this code
        if (a > c) {
            t = a;
            a = c;
            c = t;
        }
        // With above code, a is the smallest integer
        // b is smaller than c with this code
        if (b > c) {
            t = b;
            b = c;
            c = t;
        }
        // Finally, a<b<c
        StdOut.printf("%d; %d; %d\n", a, b, c);
    }
}
