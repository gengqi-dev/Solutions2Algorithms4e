/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */


import edu.princeton.cs.algs4.StdOut;

public class Excercise03 {
    public static void main(String[] args) {
        if (args.length == 3) {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = Integer.parseInt(args[2]);
            if (a == b && a == c) {
                StdOut.println("Equal");
            }
            else {
                StdOut.println("Not equal");
            }
        }
    }
}
