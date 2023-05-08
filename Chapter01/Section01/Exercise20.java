/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Chapter01.Section01;

import edu.princeton.cs.algs4.StdOut;

public class Excercise20 {
    public static void main(String[] args) {
        StdOut.println(lnn(5));
    }

    public static double lnn(int N) {
        if (N == 1) {
            return 0;
        }
        return Math.log(N) + lnn(N - 1);
    }
}
