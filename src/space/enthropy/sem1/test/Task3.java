package space.enthropy.sem1.test;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = in.nextInt();
        }
        int k = in.nextInt();
        System.out.println(solve3(k, ar));
    }

    public static int solve3(int k, int[] ar) {
        int cnt = 0;
        int idx = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                if (ar[i] > ar[j]) {
                    int temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] == ar[j]) {
                    cnt++;
                    break;
                }
            }
        }
        boolean flag = false;
        int[] array = new int[ar.length - cnt];
        for (int i = 0; i < ar.length; i++) {
            for (int j = i; j < ar.length; j++) {
                array[idx] = ar[i];
                if (!flag) {
                    idx++;
                    flag = true;
                }
                if (ar[i] == ar[j] && i != j) {
                    idx++;
                    break;
                }
            }
        }
        // Idea: Посчитали кол-во совпадающих
        // Создали массив из длины - кол-ва совпадающих
        // Was: 10, counted 4, became 6
        // Заполняю новый массив (размера 6) только уникальными числами
        return array[k - 1];
    }
}
