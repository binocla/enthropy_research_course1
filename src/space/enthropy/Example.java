package space.enthropy;

import java.util.Scanner;

public class Example {
    public static void PrintLine(int num, int count) {

        for (int i = 0; i < count; i++)

            System.out.printf("%d ", num);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int n = sc.nextInt();
        for (int i = h; i > 0; i--) {
            PrintLine(n, i);
            System.out.println();
        }
    }
}
