package space.enthropy.lesson1;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a == 0) {
            System.out.println("NO");
        } else {
            int sum = 0;
            int max = a;
            boolean flag = false;
            while (a != 0) {
                a = in.nextInt();
                if (a == max) {
                    flag = true;
                } else {
                    if (a > max) {
                        max = a;
                        sum = 0;
                    } else {
                        if (!flag) {
                            sum += a;
                        }
                    }
                }
            }
            System.out.println(sum);
        }
    }
}
