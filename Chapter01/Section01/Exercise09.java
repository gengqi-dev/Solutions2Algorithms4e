/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Chapter01.Section01;

import edu.princeton.cs.algs4.StdOut;

public class Excercise09 {
    public static void main(String[] args) {
        int data = Integer.parseInt(args[0]);
        String result = "";
        while (data > 0) {
            result = (data & 1) + result;
            data >>= 1;
        }
        StdOut.println(result);
    }
}
