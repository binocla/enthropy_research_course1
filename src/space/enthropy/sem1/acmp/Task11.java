package space.enthropy.sem1.acmp;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int decimal = 0;
        int cnt = 0;
        int temp = n;
        while (temp > 0) {
            cnt++;
            temp /= 10;
        }
        int multiplier = 10;
        for (int i = 0; i < cnt; i++) {
            decimal += (Math.pow(k, i) * (n % multiplier));
            n /= 10;
        }
        System.out.println(decimal);
    }
}
