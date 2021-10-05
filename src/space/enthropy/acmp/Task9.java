package space.enthropy.acmp;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = 0;
        int cnt = 0;
        int temp = n;
        int digit;
        while (n > 0) {
            n = n / 10;
            cnt++;
        }
        int[] ar = new int[cnt];
        while (temp > 0) {
            digit = temp % 10;
            if (digit % 2 != 0) {
                ar[cnt - 1] = digit;
            }
            temp /= 10;
            cnt--;
        }
        cnt = 0;
        for (int i = ar.length - 1; i >= 0; i--) {
            if (ar[i] != 0) {
                cnt++;
            }
        }
        int multiplier = 1;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] != 0) {
                for (int j = 1; j < cnt; j++) {
                    multiplier *= 10;
                }
                m += multiplier * ar[i];
                multiplier = 1;
                cnt--;
            }
        }
        System.out.println(m);
    }
}
