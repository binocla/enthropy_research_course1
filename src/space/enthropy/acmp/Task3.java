package space.enthropy.acmp;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        while (n > 1) {
            i++;
            if (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
                i = 1;
            }
        }
    }
}
