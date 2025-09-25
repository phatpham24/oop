import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

import java.util.Scanner;

public class RandomWalk {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        StdDraw.setScale(-n - 0.5, n + 0.5);
        StdDraw.clear(StdDraw.GRAY);
        StdDraw.enableDoubleBuffering();

        int x = 0, y = 0;
        int steps = 0;

        int[][] dirs = {{1,0}, {0,1}, {-1,0}, {0,-1}};
        int dirIndex = 0;
        int stepLength = 1;
        int stepCount = 0;
        int changes = 0;

        while (Math.abs(x) <= n && Math.abs(y) <= n) {

            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.filledSquare(x, y, 0.45);

            x += dirs[dirIndex][0];
            y += dirs[dirIndex][1];
            steps++;
            stepCount++;

            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.filledSquare(x, y, 0.45);

            StdDraw.show();
            StdDraw.pause(100);


            if (stepCount == stepLength) {
                stepCount = 0;
                dirIndex = (dirIndex + 1) % 4;
                changes++;

                if (changes % 2 == 0) {
                    stepLength++;
                }
            }
        }

        StdOut.println("Total steps = " + steps);
    }
}
