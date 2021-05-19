import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Hanoi Tower Troubles Again!
The game consists of N pegs and a LOT of balls.
The balls are numbered 1,2,3... The balls look ordinary, but they are actually magic.
If the sum of the numbers on two balls is NOT a square number,
they will push each other with a great force when they're too closed,
so they can NEVER be put together touching each other.

The player should place one ball on the top of a peg at a time.
He should first try ball 1, then ball 2, then ball 3...
If he fails to do so, the game ends. Help the player to place as many balls as possible.

For each test case in the input print a line containing an integer
indicating the maximal number of balls that can be placed.
Print -1 if an infinite number of balls can be placed.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int T, N;
        // Number of test cases (1 ≤ T ≤ 50)
        T = Integer.parseInt(in.readLine());
        for (int i = 0; i < T; i++) {
            // Number of pegs available (1 ≤ N ≤ 50)
            N = Integer.parseInt(in.readLine());
            System.out.println(maxNumberOfBalls(N));
        }
    }

    public static int maxNumberOfBalls(int n) {
        // Array for each peg
        int[] pegs = new int[n];
        // Start with ball # 1
        int ball = 1;

        while (true) {
            boolean isValid = true;
            // check each peg if valid. If no peg is valid break out of loop
            for (int peg = 0; peg < pegs.length; peg++) {
                // If sum of peg is 0 or the sum is a perfect square
                if (pegs[peg] == 0 || isPerfectSquare(ball + pegs[peg])) {
                    pegs[peg] = ball;
                    ball++;
                    isValid = true;
                    // Found a peg for the ball. Can break from loop
                    break;
                }
                isValid = false;
            }
            // If no peg has been found break from while loop
            if (!isValid)
                break;
        }
        // Each ball is numbered 1 to n. So when we return we subtract 1 to get actual number of balls
        return ball - 1;
    }

    public static boolean isPerfectSquare(int n) {
        int sr = (int) Math.sqrt(n);
        return (sr * sr) == n;
    }
}
