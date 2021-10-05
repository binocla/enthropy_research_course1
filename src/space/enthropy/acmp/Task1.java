package space.enthropy.acmp;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int m = in.nextInt();
        for (int i = k; i <= m; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
