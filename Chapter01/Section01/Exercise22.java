/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */


import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Excercise22 {
    public static int rank(int key, int[] a, int lo, int hi, int depth) { // Array must be sorted.
        String s = "";
        for (int i = 0; i < depth; ++i) {
            s += ' ';
        }
        StdOut.printf("%sHI:%d;LO:%d\n", s, hi, lo);

        if (hi < lo)
            return -1;
        int mid = lo + (hi - lo) / 2;
        if (key > a[mid]) {
            return rank(key, a, mid + 1, hi, depth + 1);
        }
        else if (key < a[mid]) {
            return rank(key, a, lo, mid - 1, depth + 1);
        }
        else {
            return mid;
        }
    }

    public static void main(String[] args) {
        int[] whitelist = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            int index = rank(key, whitelist, 0, whitelist.length - 1, 0);
            if (index < 0)
                StdOut.println(-1);
            else
                StdOut.println(index);
        }
    }
}
