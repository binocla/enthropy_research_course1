package space.enthropy.lesson9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        switch (n) {
            case 1:
                System.out.println("Mon");
                break;
            case 2 :
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("W");
                // ......
            default:
                System.out.println("Incorrect");

        }
    }
}
