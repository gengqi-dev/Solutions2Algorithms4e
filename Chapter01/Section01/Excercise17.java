/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Chapter01.Section01;

import edu.princeton.cs.algs4.StdOut;

public class Excercise17 {
    public static void main(String[] args) {
        StdOut.println(exR2(6));
    }

    public static String exR2(int n) {
        String s = exR2(n - 3) + n + exR2(n - 2) + n;
        if (n <= 0) return "";
        return s;
    }
}
