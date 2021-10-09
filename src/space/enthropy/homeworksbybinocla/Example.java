package space.enthropy.homeworksbybinocla;

import java.util.Arrays;
import java.util.Scanner;


public class Example {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = in.nextLine().split(" ");
        System.out.println(Arrays.toString(str));
        String[] str1 = {"says", "that", "Binocla", "loves", "you!"};
        int k = 0;
        int sum = 0;
        boolean t = true;

        if ((str.length - 1 != str1.length)) {
            System.out.print("What a mess!");
            t = false;

        } else {
            for (int i = 0; i < str1.length; i++) {
                if (str[i + 1].equals(str1[i])) {
                    k++;

                }

            }
        }
        if (t) {
            if ((k != str1.length) && (str.length - 1 == str1.length)) {
                System.out.println("What a mess");
            } else {
                for (int j = 0; j < str.length; j++) {
                    for (int l = 0; l < str[j].length(); l++) {
                        sum += (int) str[j].charAt(l);
                    }
                }

                System.out.print(sum + 5 * (int) (' '));
            }
        }

    }
}