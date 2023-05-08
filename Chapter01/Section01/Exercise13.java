/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Chapter01.Section01;

import edu.princeton.cs.algs4.StdOut;

public class Exercise13 {
    public static void main(String[] args) {
        int m = 7;
        int n = 8;

        double[][] a = new double[m][n];
        double[][] b = new double[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = Math.random();
                StdOut.printf("%.3f,", a[i][j]);
            }
            StdOut.println();
        }
        // Transposition
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[j][i] = a[i][j];,
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                StdOut.printf("%.3f,", b[i][j]);
            }
            StdOut.println();
        }
    }
}
