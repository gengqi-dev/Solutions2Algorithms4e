/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Chapter01.Section01;

import edu.princeton.cs.algs4.StdOut;

public class Exercise18 {
    public static void main(String[] args) {
        StdOut.println("mystery(2, 25):" + mystery(2, 25));
        StdOut.println("mystery(3, 11):" + mystery(3, 11));
        StdOut.println("mystery2(2, 25):" + mystery2(2, 25));
        StdOut.println("mystery2(3, 11):" + mystery2(3, 11));
    }

    // Compute a*b
    public static int mystery(int a, int b) {
        if (b == 0) return 0;
        if (b % 2 == 0) return mystery(a + a, b / 2);
        return mystery(a + a, b / 2) + a;
    }


    // Compute a^b
    public static int mystery2(int a, int b) {
        if (b == 0) return 1;
        if (b % 2 == 0) return mystery2(a * a, b / 2);
        return mystery2(a * a, b / 2) * a;
    }
}
