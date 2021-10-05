package space.enthropy.acmp;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float x = in.nextFloat();
        float sr = x / 2;
        float temp;
        do {
            temp = sr;
            sr = (temp + (x / temp)) / 2;
        } while ((temp - sr) != 0);
        System.out.println(sr);
    }
}
