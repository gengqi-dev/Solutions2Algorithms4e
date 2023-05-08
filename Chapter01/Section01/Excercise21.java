/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */


import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Excercise21 {
    public static void main(String[] args) {

        int[] v1 = new int[100];
        int[] v2 = new int[100];
        String[] names = new String[100];
        int counter = 0;

        while (!StdIn.isEmpty()) {
            String input = StdIn.readLine();
            String[] data = input.split(" ");
            if (data.length == 3) {
                names[counter] = data[0];
                v1[counter] = Integer.parseInt(data[1]);
                v2[counter] = Integer.parseInt(data[2]);
                counter++;
            }
            else {
                break;
            }
        }

        for (int i = 0; i < counter; ++i) {
            StdOut.printf("%s %d %d %.3f\n", names[i], v1[i], v2[i], v1[i] / (double) v2[i]);
        }
    }
}
