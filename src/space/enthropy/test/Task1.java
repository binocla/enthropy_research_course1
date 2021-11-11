package space.enthropy.test;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    private static int n;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        n = in.nextInt();
        int[][] a = new int[n][n];
        for (int k = 0; k < n - m; k++) {
            a[getI(k, m)][getJ(k, m)] = k + 1;
        }
        System.out.println(Arrays.deepToString(a));
    }

    public static int getI(int k, int m) {
        return m + k;
    }
    public static int getJ(int k, int m) {
        return n - k - 1;
    }
}