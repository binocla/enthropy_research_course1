package space.enthropy.homeworksbybinocla;

import java.io.*;
import java.util.*;


public class ImpossibleExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean m = false;
        String[] str = in.nextLine().split(" ");
        if (str[0].contains("минус")) {
            m = true;
        }
        String[] str1 = {"од", "дв", "три", "четыр", "пят", "шест", "сем", "восем", "девят"};
        String[] str10 = {"дцать", "десят"};
        String[] strisk = {"десять", "сорок", "девяносто"};
        String s100 = "сто";
        String[] str100 = {"cта", "сот", "сти"};
        String[] str103_1012 = {"тысяч", "миллион", "миллиард", "триллиард"};
        long[] num = new long[str.length];
        for (int i = 0; i < str.length; i++) {
            int t = 0;
            for (int j = 0; j < str1.length; j++) {
                if (str[i].contains(str1[j])) {
                    if (str[i].contains("дв")) {
                        t = 2;
                    }
                    if (str[i].contains("тр")) {
                        t = 3;
                    }
                    if (str[i].contains("четыр")) {
                        t = 4;
                    }
                    if (str[i].contains("пят")) {
                        t = 5;
                    }
                    if (str[i].contains("шест")) {
                        t = 6;
                    }
                    if (str[i].contains("сем")) {
                        t = 7;
                    }
                    if (str[i].contains("восем")) {
                        t = 8;
                    }
                    if (str[i].contains("девят")) {
                        t = 9;
                    }
                    if (str[i].contains("од")) {
                        t = 1;
                    }
                    if (str[i].contains("дцать") || (str[i].contains("десят"))) {
                        t *= 10;
                    }
                    if (str[i].contains("ста") || (str[i].contains("сот")) || (str[i].contains("сти"))) {
                        t *= 100;
                    }
                }
            }
            num[i] = t;
            if (str[i].contains(s100)) {
                num[i] = 100;
            }
            for (int y = 0; y < strisk.length; y++) {
                if (str[i].contains(strisk[y])) {
                    if (str[i].contains("десять")) {
                        num[i] = 10l;
                    } else if (str[i].contains("сорок")) {
                        num[i] = 40l;
                    } else {
                        num[i] = 90l;
                    }
                }
            }
            for (int l = 0; l < str103_1012.length; l++) {
                if (str[i].contains(str103_1012[l])) {
                    if (str[i].contains("тысяч")) {
                        num[i] = 1000l;
                    } else if (str[i].contains("миллион")) {
                        num[i] = 1000000l;
                    } else if (str[i].contains("миллиард")) {
                        num[i] = 1000000000l;
                    } else {
                        num[i] = 1000000000000l;
                    }
                }
            }
        }
        long sum = 0l;
        boolean flag = false;
        System.out.println(Arrays.toString(num));
        if (m) {
            for (int tr = 0; tr < str.length - 1; tr++) {
                num[tr] = num[tr + 1];
                if (tr == str.length - 2) {
                    num[tr + 1] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(num));
        long temp = num[0];
        for (int q = 0; q < str.length - 1; q++) {
            if (num[q] < num[q + 1]) {
                temp *= num[q + 1];
                sum += temp;
                temp = 0l;
            } else {
                temp += num[q + 1];
            }
            if ((q == str.length - 2) && (num[q] > num[q + 1])) {
                sum += temp;
            }
            flag = true;
        }
        if (m) {
            if (flag) {
                System.out.print("-" + sum);
            } else {
                System.out.print("-" + temp);
            }
        } else {
            if (flag) {
                System.out.print(sum);
            } else {
                System.out.print(temp);
            }

        }
    }

}