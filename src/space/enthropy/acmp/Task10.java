package space.enthropy.acmp;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long sum = 0;
        long j = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum + j;
            j = (j * 10) + 1;
        }
        System.out.println(sum);
    }
}
