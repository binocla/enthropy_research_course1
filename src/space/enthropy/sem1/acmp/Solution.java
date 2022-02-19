package space.enthropy.sem1.acmp;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        String even = ""; // String for saving even numbers
        String odd = ""; // String for saving odd numbers
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                even += a[i] + " ";
            } else {
                odd += a[i] + " ";
            }
        }
        System.out.println(odd);
        System.out.println(even);
        if (even.length() >= odd.length()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
