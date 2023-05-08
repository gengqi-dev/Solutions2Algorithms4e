/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdOut;

public class Exercise05 {
    public static void main(String[] args) {
        if (args.length == 2) {
            double x = Double.parseDouble(args[0]);
            double y = Double.parseDouble(args[1]);
            if (x > 0.0 && x < 1.0) {
                if (y > 0.0 && y < 1.0) {
                    StdOut.println(true);
                    return;
                }
            }
            StdOut.println(false);
        }
    }
}
