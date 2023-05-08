/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Chapter01.Section01;

import edu.princeton.cs.algs4.StdOut;

import java.math.BigInteger;

public class Excercise19 {
    public static BigInteger F(int N) {
        /*
         *   Recursive method to calculate the value
         *   */
        // if (N == 0) return 0;
        // if (N == 1) return 1;
        // return F(N - 1) + F(N - 2);

        BigInteger[] fList = new BigInteger[N + 1];
        for (int i = 0; i < N + 1; ++i) {
            if (i < 2) {
                fList[i] = new BigInteger(i + "");
            }
            else {
                fList[i] = fList[i - 1].add(fList[i - 2]);
            }
        }
        return fList[N];
    }

    public static void main(String[] args) {
        for (int N = 0; N < 100; N++)
            StdOut.println(N + " " + F(N));
    }
}
