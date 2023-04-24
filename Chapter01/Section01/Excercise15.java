/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Chapter01.Section01;

import edu.princeton.cs.algs4.StdOut;

public class Excercise15 {
    public static void main(String[] args) {
        int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int M = 10;
        int[] r = histogram(a, M);
        StdOut.println(r[0]);
    }

    private static int[] histogram(int[] a, int M) {
        int[] result = new int[M];
        for (int i = 0; i < a.length; ++i) {
            if (a[i] < M)
                result[a[i]]++;
        }
        return result;
    }

}
