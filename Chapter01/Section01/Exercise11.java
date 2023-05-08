/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Chapter01.Section01;

import edu.princeton.cs.algs4.StdOut;

public class Excercise11 {
    public static void main(String[] args) {
        boolean[][] arr = new boolean[7][8];
        // Do print
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[0].length; ++j)
                arr[i][j] = Math.random() > 0.5;
        }
        StdOut.print(" ");
        for (int i = 0; i < arr[0].length; ++i) {
            StdOut.print(i + 1);
        }
        StdOut.println();
        for (int i = 0; i < arr.length; ++i) {
            StdOut.print(i + 1);
            for (int j = 0; j < arr[0].length; ++j) {
                if (arr[i][j]) {
                    StdOut.print("*");
                }
                else {
                    StdOut.print(" ");
                }
            }
            StdOut.println();
        }
    }
}
