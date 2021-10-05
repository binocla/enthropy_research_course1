package space.enthropy.acmp;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double s = 0;
        for (int i = 1; i <= n; i++) {
            long factOfHigher = 1;
            for (int j = 2; j <= (i - 1); j++) {
                factOfHigher = factOfHigher * j;
            }
            long factOfLower = 1;
            for (int j = 2; j <= 2 * i; j++) {
                factOfLower = factOfLower * j;
            }
            s += Math.pow(factOfHigher, 2) / factOfLower;
        }
        System.out.println(s);
    }
}
