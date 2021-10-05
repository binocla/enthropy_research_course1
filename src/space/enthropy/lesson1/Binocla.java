package space.enthropy.lesson1;

import java.util.Scanner;

public class Binocla {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[] ar = new char[n];
        int cntYo = 0;
        int cntYe = 0;

        for (int i = 0; i < n; i++) {
            ar[i] = in.next().charAt(0);
            if (ar[i] == 'е') {
                cntYe++;
            } else if (ar[i] == 'ё') {
                cntYo++;
                ar[i] = 'е';
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (ar[i] < ar[j]) {
                    char temp = ar[j];
                    ar[j] = ar[i];
                    ar[i] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (cntYe == 0 && cntYo != 0 && ar[i] == 'е') {
                ar[i] = 'ё';
                cntYo--;
            } else if (cntYe != 0 && ar[i] == 'е') {
                cntYe--;
            }
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        for (int i = n - 1; i >= 0; i--) {
            if (cntYe == 0 && cntYo != 0) {
                ar[i] = 'ё';
                cntYo--;
            }
            if (cntYe != 0) {
                cntYe--;
            }
            System.out.print(ar[i] + " ");
        }
    }
}
