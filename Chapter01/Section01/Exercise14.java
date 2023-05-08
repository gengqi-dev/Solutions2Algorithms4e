/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdOut;

import java.util.Random;

public class Exercise14 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; ++i) {
            int data = random.nextInt(10000);
            StdOut.println("log2(" + data + ") is " + lg(data));
        }
    }

    private static int lg(int data) {
        int result = 0;
        while (data >= 2) {
            result++;
            data /= 2;
        }
        return result;
    }
}
