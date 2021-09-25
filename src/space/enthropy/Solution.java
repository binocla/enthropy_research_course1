package space.enthropy;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int cnt = 0; // cnt = 0 -> все равно, 1 -> <, 2 -> >
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        while (true) {
            int b = in.nextInt();
            if (b == 0) {
                if (flag1 && flag2 || (flag3 && flag2) || (flag1 && flag3)) {
                    System.out.println("!");
                    break;
                }
                if (cnt == 0) {
                    System.out.println("ravn");
                }
                if (cnt == 1) {
                    System.out.println("<");
                }
                if (cnt == 2) {
                    System.out.println(">");
                }
                break;
            }
            if (a == b) {
                flag3 = true;
                cnt = 0;
            }
            if (a > b) {
                flag1 = true;
                cnt = 1;
            }
            if (a < b) {
                flag2 = true;
                cnt = 2;
            }
            a = b;
        }

    }
}
